package com.bdo.dc.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "am_user_master")
public class AmUserMaster {

	@Field("userName")
	private String userName;
	
	@Field("password")
	private String password;
}
