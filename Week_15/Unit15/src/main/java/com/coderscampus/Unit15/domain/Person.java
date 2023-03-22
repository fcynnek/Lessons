package com.coderscampus.Unit15.domain;

public class Person {

	private String firstname;
	private String lastname;
	private Integer id;
	
	
	
	public Integer getId() {
		return id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}

	
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
}
