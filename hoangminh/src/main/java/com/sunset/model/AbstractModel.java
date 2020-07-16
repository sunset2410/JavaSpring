package com.sunset.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractModel<T> {
	private Long id;	
	private long[] ids;
	private List<T> listResult = new ArrayList<T>();
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	private String createdBy;
	private String modifiedBy;
	private int page;
	private int maxPageItems;
	private int totalPage;
	
}
