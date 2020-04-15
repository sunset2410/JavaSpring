package com.sunset.dao;

import java.util.List;

import com.sunset.model.NewsModel;


public interface INewsDao extends IGenericDAO<NewsModel>  {
	NewsModel findOne(Long id);
	List<NewsModel> findByCategoryId(Long categoryId);
	Long save(NewsModel newModel);
	void update(NewsModel updateNew);
	void delete(long id);
	//List<NewsModel> findAll(Pageble pageble);
	int getTotalItem();
}