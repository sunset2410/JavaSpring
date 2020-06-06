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
		newsModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		//CategoryModel category = categoryDAO.findOneByCode(newsModel.getCategoryCode());
		//newsModel.setCategoryId(category.getId());
		Long newId = newDao.save(newsModel);
		return newDao.findOne(newId);
	}
	
	
	@Override
	public NewsModel update(NewsModel updateNew) {
		NewsModel oldNew = newDao.findOne(updateNew.getId());
		
		updateNew.setCreatedDate(oldNew.getCreatedDate());
		updateNew.setCreatedBy(oldNew.getCreatedBy());
		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		
		//CategoryModel category = categoryDAO.findOneByCode(updateNew.getCategoryCode());
		//updateNew.setCategoryId(category.getId());
		newDao.update(updateNew);
		return newDao.findOne(updateNew.getId());
	}

	@Override
	public void delete(long ids) {
		//for(long id: ids)
		{
			// delete comments  of news before delete news
			// implement
			newDao.delete(ids);
		}		
	}
	

}
