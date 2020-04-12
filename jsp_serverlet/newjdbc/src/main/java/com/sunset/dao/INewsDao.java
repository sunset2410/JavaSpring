package com.sunset.dao;

import java.util.List;

import com.sunset.model.NewsModel;

public interface INewsDao extends IGenericDAO<NewsModel>  {
	NewsModel findOne(Long id);
	List<NewsModel> findByCategoryId(Long categoryId);
}