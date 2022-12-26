package com.coderscampus.week9;

public class Person {

	private Integer ssn;
	private String firstName;
	private String lastName;
	
	
	public Integer getSsn() {
		return ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
