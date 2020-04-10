package com.sunset.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunset.model.UserModel;

@WebServlet(urlPatterns = {"/admin-home"})
public class AdminHomeController extends HttpServlet{
	private static final long serialVersionUID = 203054357703098524L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		
		/*
		 * UserModel userModel = new UserModel();
		 * userModel.setUserName("Hello World admin home");
		 * req.setAttribute("model_admin", userModel);
		 */
		
		RequestDispatcher rd  = req.getRequestDispatcher("views/admin/admin_home.jsp");
		rd.forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
}













