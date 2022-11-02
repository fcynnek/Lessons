package com.coderscampus.lesson3;

// POJO = Plain Old Java Object
public class User {

	// instance variables (declared as private)
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int phoneNumber;

	// getters and setters for the above instance variables
	// the 2 below getter and setter would have been typed manually
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	// there is a way to generate them with a function
	// right click > Source > Generate Getters and Setters > choose properties
	// needed to create getters and setters for > Generate
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
