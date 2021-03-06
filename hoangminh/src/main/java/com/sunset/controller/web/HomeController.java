package com.sunset.controller.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunset.constant.SystemConstant;
import com.sunset.model.CategoryModel;
import com.sunset.model.NewsModel;
import com.sunset.service.ICategoryService;
import com.sunset.service.INewService;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	@Inject
	private ICategoryService categoryService;

	@Inject
	private INewService newService;

	private static final long serialVersionUID = 203054357703098524L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
		Long categoryId = 1L;
		List<NewsModel> list = newService.findByCategoryId(categoryId);
		System.out.print("chieu:" + list.get(0).getTitle());
		req.setAttribute("news", newService.findByCategoryId(categoryId));
		*/
		
		//--- list category---//
		List<CategoryModel> list_category = categoryService.findAll();
		for (int i = 0; i < list_category.size() - 1; i++) {
			System.out.print("chieu1: " + list_category.get(i).getName());
		}
		req.setAttribute("categories", list_category);
		
		//-----list product----//
		NewsModel model = new NewsModel();
		model.setListResult(newService.findAll());
		req.setAttribute(SystemConstant.Model, model);
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String appPath = req.getServletContext().getRealPath("");
	}

}
