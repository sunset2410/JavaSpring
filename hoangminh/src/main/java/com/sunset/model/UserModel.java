package com.sunset.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel extends AbstractModel<UserModel>{
	private Long id;
	private String userName;
	private String fullName;
	private String password;
	private int status;
	private Long roleId;
	private Timestamp createDate;
	private Timestamp modifiedDate;
	private String createBy;
	private String modifiedBy;
	
	
}
