package com.coderscampus.lesson1;

public class CompSciTeacher extends Teacher {

	public CompSciTeacher () {
		System.out.println("Inside the CompSciTeacher constructor");
		this.setClasses("COMP 101, COMP 201");
		this.setLevelOfEducation("Bachelor of Sci");
	}
}
