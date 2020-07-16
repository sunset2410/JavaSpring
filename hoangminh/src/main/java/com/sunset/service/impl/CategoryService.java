package com.sunset.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.sunset.dao.ICategoryDAO;
import com.sunset.model.CategoryModel;
import com.sunset.service.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject
	private ICategoryDAO  categoryDao;
	
	@Override
	public List<CategoryModel> findAll() {
	
		return categoryDao.findAll();
	}

	
	
	
}
