package com.sunset.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin-settings-result")
public class SettingsResultControler extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public SettingsResultControler() {
	       super();
	   }
	 
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 RequestDispatcher rd = req.getRequestDispatcher("/views/admin/new/settings_result.jsp");
			rd.forward(req, resp);
	}
	
}
