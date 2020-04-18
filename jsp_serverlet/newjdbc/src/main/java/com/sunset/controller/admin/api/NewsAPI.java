package com.sunset.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sunset.model.NewsModel;
import com.sunset.service.INewService;
import com.sunset.utils.HttpUtils;

@WebServlet(urlPatterns = { "/api-admin-news" })
public class NewsAPI extends HttpServlet {
	private static final long serialVersionUID = 1231167971496232004L;

	@Inject
	private INewService newsServvice;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		JSONObject jsonObject = HttpUtils.toJSONObject(req.getReader());
		NewsModel newsModel = new NewsModel();
		newsModel.setCategoryId((Long) jsonObject.get("categoryid"));
		System.out.print("chieu test setCategoryid: " + newsModel.getCategoryId());
		newsModel.setTitle(jsonObject.get("title").toString());
		newsModel.setContent(jsonObject.get("content").toString());

		System.out.print("chieu test: " + newsModel);
		newsModel = newsServvice.save(newsModel);

		// reeturn json value for client
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(resp.getOutputStream(), newsModel);

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		JSONObject jsonObject = HttpUtils.toJSONObject(req.getReader());
		NewsModel newsModel = new NewsModel();
		newsModel.setCategoryId((Long) jsonObject.get("categoryid"));
		System.out.print("chieu test setCategoryid: " + newsModel.getCategoryId());
		newsModel.setTitle(jsonObject.get("title").toString());
		newsModel.setContent(jsonObject.get("content").toString());
		newsModel.setId((Long) jsonObject.get("id"));

		System.out.print("chieu test: " + newsModel);
		newsModel = newsServvice.update(newsModel);

		// reeturn json value for client
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(resp.getOutputStream(), newsModel);

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		
		JSONObject jsonObject = HttpUtils.toJSONObject(req.getReader());
		System.out.print("chieu test: " + jsonObject.get("ids"));
		newsServvice.delete((long)jsonObject.get("ids"));
		mapper.writeValue(resp.getOutputStream(), "{rcode:200}");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

}
