package com.sunset.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.sunset.model.NewsModel;
import com.sunset.dao.INewsDao;
import com.sunset.mapper.NewMapper;


public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDao{
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		List<NewsModel> results = new ArrayList<NewsModel>();
		String sql = "SELECT * FROM news WHERE categoryid =?";		
		return query(sql, new NewMapper(), categoryId);
	}



	@Override
	public NewsModel findOne(Long id) {
		String sql = "SELECT * FROM news WHERE id = ?";
		List<NewsModel> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}
	
	@Override
	public Long save(NewsModel newModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO news (title, content,");
		sql.append(" thumbnail, shortdescription, categoryid, createddate, createdby)");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), newModel.getTitle(), newModel.getContent(), 
				newModel.getThumbnail(), newModel.getShortDescription(), newModel.getCategoryId(),
				newModel.getCreateDate(), newModel.getCreateBy());
	}

	@Override
	public void update(NewsModel updateNew) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return 0;
	}
}
