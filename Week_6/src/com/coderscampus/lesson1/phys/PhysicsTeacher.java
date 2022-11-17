package com.coderscampus.lesson1.phys;
// moved this class to its own package which means that now it needs to import Teacher from lesson1 package in order to compile

import com.coderscampus.lesson1.Teacher;

public class PhysicsTeacher extends Teacher {
// inheritance happens at the class level
// is a = inheritance
	
	public PhysicsTeacher() {
		System.out.println("Inside the PhysicsTeacher constructor");
		this.setClasses("PHYS 101, PHYS 201");
		this.setLevelOfEducation("Masters of Science");
	}
	
	public void teach () {
		System.out.println("I'm a physics teacher and I'm now teaching physics");
	}
	
	public void teach (String teacherName) {
		System.out.println("I'm a teacher called " + teacherName + " and I'm now teaching");
	}
}
