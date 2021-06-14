package com.vanilla.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.vanilla.inventory.entity.commons.MetaObject;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
public class Users extends MetaObject{

	@Column(nullable = false)
	private String user_name;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String first_name;
	
	@Column(nullable = false)
	private String last_name;
	

}
