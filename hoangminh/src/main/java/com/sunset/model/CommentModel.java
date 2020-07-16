package com.sunset.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentModel extends AbstractModel<CommentModel> {
	private String content;
	private Long userId;
	private Long newsId;
	
}
