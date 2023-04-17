package com.coderscampus.Unit18.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// Import javax.persistence
// JPA = Java Persistence API

@Table (name = "users")
// table override because user is a reserved word 
public class User {
	
	/*
	 * 	Class name = User
	 * 	DB Table name = user 	(if table name is 2 words, ie: "online_bank")
	 */

	private Long userId;
	private String username;
	private String password;
	private String name;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	// this is to signal SQL that the ID will be used as PK and GeneratedValue is to have SQL AI
	// also recommended to add this to the setter
	public Long getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
