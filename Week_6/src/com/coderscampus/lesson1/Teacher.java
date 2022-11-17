package com.coderscampus.lesson1;

public class Teacher {
// inheritance when the child branches are able to access the methods and classes from the parent branch
// this is helpful because code reuse is the main reason
	
	private String classes;
	private String levelOfEducation;
	protected int totalNumberOfMarkedPapers;
	
	protected void markPapers () {
		System.out.println("I'm a teacher and I'm now marking papers");
	}
	
	private void giveARaise () {
		System.out.println("Teacher gets a raise!");
	}
	
	public Teacher () {
		System.out.println("Inside the Teacher constructor");
		this.classes = "No classes assigned";
		this.levelOfEducation = "No education assigned";
	}
	
	public void teach () {
		System.out.println("I'm a teacher and I'm now teaching");
	}
	
//	public void teach (String teacherName) {
//		System.out.println("I'm a teacher called " + teacherName + " and I'm now teaching");
//	}
	
	public void teach (int age) {
		System.out.println("I'm a " + age + " year old teacher and I'm now teaching");
	}
	
	public void teach (String teacherName, int age) {
		System.out.println("I'm a " + age + " year old teacher called " + teacherName + " and I'm now teaching");
	}


	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
	
	
}
