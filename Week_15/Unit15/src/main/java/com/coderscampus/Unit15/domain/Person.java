package com.coderscampus.Unit15.domain;

public class Person {

	private String firstname;
	private String lastname;
	
	
	
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
	
	
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
}
