package com.sunset.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.sunset.dao.ICategoryDAO;
import com.sunset.dao.INewsDao;
import com.sunset.model.CategoryModel;
import com.sunset.model.NewsModel;
import com.sunset.service.INewService;

public class NewService implements INewService{

	@Inject 
	private INewsDao newDao;
	
	@Inject
	private ICategoryDAO categoryDAO;

	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newDao.findByCategoryId(categoryId);
	}

	@Override
	public NewsModel save(NewsModel newsModel) {
		newsModel.setCreateDate(new Timestamp(System.currentTimeMillis()));
		//CategoryModel category = categoryDAO.findOneByCode(newsModel.getCategoryCode());
		//newsModel.setCategoryId(category.getId());
		Long newId = newDao.save(newsModel);
		return newDao.findOne(newId);
	}

}
