package com.sunset.controller.web;

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


@WebServlet(urlPatterns = { "/web-product" })
public class ProductControler extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Inject	
	private INewService newService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id_str = req.getParameter("id");
		Long id = Long.parseLong(id_str);
		
		NewsModel model = new NewsModel();
		model = newService.findOne(id);
		req.setAttribute(SystemConstant.Model, model);
		
		req.setAttribute(SystemConstant.Model, model);
		RequestDispatcher rd = req.getRequestDispatcher("views/web/product.jsp");
		rd.forward(req, resp);		
	}
	
	
	
}
