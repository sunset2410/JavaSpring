package com.sunset.service;

import java.util.List;

import com.sunset.model.NewsModel;

public interface INewService {
	
	List<NewsModel> findByCategoryId(Long  categoryId);
	NewsModel save(NewsModel newsModel);
	NewsModel update(NewsModel updateNew);
	void delete(long ids);

}
