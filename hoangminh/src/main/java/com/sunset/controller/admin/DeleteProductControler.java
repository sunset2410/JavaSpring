package com.sunset.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunset.constant.SystemConstant;
import com.sunset.model.NewsModel;
import com.sunset.service.INewService;

@WebServlet(urlPatterns = { "/admin-delete-product" })
public class DeleteProductControler extends HttpServlet{
	private static final long serialVersionUID = 1L;
		
	@Inject	
	private INewService newService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id_str = req.getParameter("id");
		int id = Integer.parseInt(id_str);
		newService.delete(id);
		RequestDispatcher rd = req.getRequestDispatcher("/views/admin/new/delete_result.jsp");
		rd.forward(req, resp);
	}
	
	
	

}
