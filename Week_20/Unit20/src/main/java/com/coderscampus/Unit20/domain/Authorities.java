package com.coderscampus.Unit20.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

import com.coderscampus.Unit20.security.CustomSecurityUser;

@Entity
public class Authorities implements GrantedAuthority {

	private static final long serialVersionUID = -5734529493922211186L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String authority;
	@ManyToOne
	private User user;
	
	public Long getId() {
		return id;
	}
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}

	public User getUser() {
		return user;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
