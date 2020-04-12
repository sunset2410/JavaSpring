package com.sunset.model;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractModel {
	private Long id;	
	private Timestamp createDate;
	private Timestamp modifiedDate;
	private String createBy;
	private String modifiedBy;
}
