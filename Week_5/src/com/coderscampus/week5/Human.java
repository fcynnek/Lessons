package com.coderscampus.week5;

public class Human {
	
	// class variables
	static int TEENAGER_AGE = 13;
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	
	// instance variable
	// most instance variables are made private by convention
	private int age;
	
	// All instantiations can access static variables but not the other way around
	public String getStageOfLife () {
		if (age < TEENAGER_AGE) {
			return "Child";
		}
		else if (age < ADULT_AGE) {
			return "Teenager";
		}
		else if (age < SENIOR_AGE) {
			return "Adult";
		}
		else {
			return "Senior";
		}
	}
}
