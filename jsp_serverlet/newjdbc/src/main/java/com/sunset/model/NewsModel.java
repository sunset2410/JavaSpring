package com.sunset.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewsModel extends AbstractModel<NewsModel>	{
	private  String  title = "";
	private  String thumbnail  = "";
	private String shortDescription  = "";
	private String content = "";
	private  Long categoryId =0L;
	private String categoryCode = "";
	
	
}
