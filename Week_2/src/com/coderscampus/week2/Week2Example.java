package com.coderscampus.week2;

public class Week2Example {

	public static void main (String[] args) {
		int age = 9;
		
		if (age >= 19) {
			System.out.println("You are an adult");
		}
		
		else if (age >= 13) {
			System.out.println("You are a teenager");
		}
		
		else if (age == 12) {
			System.out.println("You are a pre-teen");
		}
		else {
		System.out.println("You are a child");
		}
		
		System.out.println("Your age is " + age);
	}
}
