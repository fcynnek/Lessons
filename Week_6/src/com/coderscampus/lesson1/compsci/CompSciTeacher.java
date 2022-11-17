package com.coderscampus.lesson1.compsci;
// moved this class to its own package which means that now it needs to import Teacher from lesson1 package in order to compile

import com.coderscampus.lesson1.Teacher;

public class CompSciTeacher extends Teacher {

	public CompSciTeacher () {
		System.out.println("Inside the CompSciTeacher constructor");
		this.setClasses("COMP 101, COMP 201");
		this.setLevelOfEducation("Bachelor of Sci");
	}
}
