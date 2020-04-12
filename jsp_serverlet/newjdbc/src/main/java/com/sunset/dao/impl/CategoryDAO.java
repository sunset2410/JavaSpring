package com.sunset.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.sunset.dao.ICategoryDAO;
import com.sunset.mapper.CategoryMapper;
import com.sunset.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		List<CategoryModel> results = new ArrayList<CategoryModel>();
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

}
