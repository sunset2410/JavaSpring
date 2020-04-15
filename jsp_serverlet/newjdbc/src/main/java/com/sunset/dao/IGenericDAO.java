package com.sunset.dao;

import java.util.List;

import com.sunset.mapper.RowMapper;

public interface IGenericDAO<T> {
	<T>  List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	Long insert (String sql, Object... parameters);
}
