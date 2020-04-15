package com.sunset.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewsModel extends AbstractModel	{
	private  String  title;
	private  String thumbnail;
	private String shortDescription;
	private String content;
	private  Long categoryId;
	private String categoryCode;
	
	
}
