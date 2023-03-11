package com.coderscampus.Unit14.dto;

import java.util.Objects;

public class Person {
	private Long id;
	private String name;
	private Integer age;
	private String gender;
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
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
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
