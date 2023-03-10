package com.coderscampus.Unit14.dto;

public class Person {
	
	private String name;
	private Integer age;
	private String gender;
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
