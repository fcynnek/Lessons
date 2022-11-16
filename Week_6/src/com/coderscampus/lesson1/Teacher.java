package com.coderscampus.lesson1;

public class Teacher {
// inheritance when the child branches are able to access the methods and classes from the parent branch
// this is helpful because code reuse is the main reason
	
	private String classes;
	
	private String levelOfEducation;
	
	public Teacher () {
		this.classes = "No classes assigned";
		this.levelOfEducation = "No education assigned";
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
