package com.sunset.dao;

import java.util.List;

import com.sunset.model.CategoryModel;

public interface ICategoryDAO extends IGenericDAO<CategoryModel>{
	 List<CategoryModel> findAll();
}
