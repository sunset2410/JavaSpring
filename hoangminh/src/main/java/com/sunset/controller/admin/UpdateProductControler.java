package com.sunset.controller.admin;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.sunset.constant.SystemConstant;
import com.sunset.model.NewsModel;
import com.sunset.service.INewService;

@WebServlet(urlPatterns = { "/admin-update-product" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 5, // 2MB
		maxFileSize = 1024 * 1024 * 10, // 10MB
		maxRequestSize = 1024 * 1024 * 50) // 50MB
public class UpdateProductControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SAVE_DIRECTORY = "images/products";
	String info = "";
	NewsModel model = new NewsModel();

	public UpdateProductControler() {
		super();
	}

	@Inject
	private INewService newsServvice;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id_str = req.getParameter("id");
		Long id = Long.parseLong(id_str);

		model = newsServvice.findOne(id);
		req.setAttribute(SystemConstant.Model, model);

		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/new/update_product.jsp");
		rd.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			request.setCharacterEncoding("utf-8");
			String title = request.getParameter("title");
			String shortdescription = request.getParameter("shortdescription");
			String content = request.getParameter("content");
			String price = request.getParameter("price");
			System.out.println("title: " + title);

			// Đường dẫn tuyệt đối tới thư mục gốc của web app.
			String appPath = request.getServletContext().getRealPath("");
			appPath = appPath.replace('\\', '/');

			info += "\n appPath:" + appPath;

			// Thư mục để save file tải lên.
			String fullSavePath = null;
			if (appPath.endsWith("/")) {
				fullSavePath = appPath + SAVE_DIRECTORY;
			} else {
				fullSavePath = appPath + "/" + SAVE_DIRECTORY;
			}

			info += "\n fullSavePath:" + fullSavePath;

			// Tạo thư mục nếu nó không tồn tại.
			File fileSaveDir = new File(fullSavePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}

			String fileName = "";
			// Danh mục các phần đã upload lên (Có thể là nhiều file).
			for (Part part : request.getParts()) {
				fileName = extractFileName(part);
				if (fileName != null && fileName.length() > 0) {
					String filePath = fullSavePath + File.separator + fileName;
					System.out.println("Write attachment to file: " + filePath);

					// Ghi vào file.
					part.write(filePath);
				}
			}

			// ----- save to database---------------------------//
			newsServvice.delete(model.getId());

			NewsModel newsModel = new NewsModel();
			newsModel.setCategoryId(1L);
			newsModel.setTitle(title);
			newsModel.setContent(content);
			newsModel.setThumbnail(SAVE_DIRECTORY + "/" + fileName);
			newsModel.setShortDescription(shortdescription);
			newsModel.setPrice(price);
			System.out.print("chieu test: " + newsModel);
			newsModel = newsServvice.save(newsModel);

			// Upload thành công.
			response.sendRedirect(request.getContextPath() + "/admin-upload-result");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "Error: " + e.getMessage());
			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/views/admin/new/upload_product.jsp");
			dispatcher.forward(request, response);
		}

	}

	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
				clientFileName = clientFileName.replace("\\", "/");
				int i = clientFileName.lastIndexOf('/');
				return clientFileName.substring(i + 1);
			}
		}
		return null;
	}
}
