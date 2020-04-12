package com.sunset.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.sunset.dao.INewsDao;
import com.sunset.mapper.NewMapper;
import com.sunset.model.NewsModel;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDao{
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		List<NewsModel> results = new ArrayList<NewsModel>();
		String sql = "SELECT * FROM news WHERE categoryid =?";		
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public NewsModel findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
