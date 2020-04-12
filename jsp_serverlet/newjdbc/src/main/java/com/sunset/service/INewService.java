package com.sunset.service;

import java.util.List;

import com.sunset.model.NewsModel;

public interface INewService {
	
	List<NewsModel> findByCategoryId(Long  categoryId);

}
