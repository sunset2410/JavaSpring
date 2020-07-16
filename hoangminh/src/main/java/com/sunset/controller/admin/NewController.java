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

@WebServlet(urlPatterns = { "/admin-new" })
public class NewController extends HttpServlet{
	private static final long serialVersionUID = -1790227058766144504L;

	@Inject
	private INewService newService;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NewsModel model = new NewsModel();
		model.setListResult(newService.findAll());
		req.setAttribute(SystemConstant.Model, model);
		RequestDispatcher rd = req.getRequestDispatcher("views/admin/new/list.jsp");
		rd.forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}












