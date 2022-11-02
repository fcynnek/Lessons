package com.coderscampus.lesson1;

public class Human {
	
	// class variables
	static int TEENAGER_AGE = 13;
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	
	// instance variable
	// most instance variables are made private by convention
	private int age; // can only be accessed within the Human class
	
	// access modifier , variable type
	public int getAge () {
		return age; // can be accessed from anywhere returning the value on "private" age
	}
	
	public void setAge (int age) {
		if (age < 0 || age > 150) {
			System.out.println("No no no, that's not a valid age. A valid age is between 0 and 150");
			return;
		}
		this.age = age; // can be accessed from anywhere and can modify the value of "private" age
	}
	
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
