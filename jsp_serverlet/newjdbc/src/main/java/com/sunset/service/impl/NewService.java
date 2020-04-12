package com.sunset.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.sunset.dao.INewsDao;
import com.sunset.model.NewsModel;
import com.sunset.service.INewService;

public class NewService implements INewService{

	@Inject 
	private INewsDao newDao;
	
	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newDao.findByCategoryId(categoryId);
	}

	
}
