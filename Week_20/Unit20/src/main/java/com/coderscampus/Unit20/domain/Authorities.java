package com.coderscampus.Unit20.domain;

import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Authorities implements GrantedAuthority {

	private Long id;
	private String authority;
	
	public Long getId() {
		return id;
	}
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	
}
