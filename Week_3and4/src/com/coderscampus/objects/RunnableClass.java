package com.coderscampus.objects;

import java.util.Random;

public class RunnableClass {
	
	public static void main(String[] args) {
		// Class > Blueprint for an Object
		// Object > a Noun, it's an instantiation of a Class
		
		// Data type : variable name : assignment operation
//		int someNumber = 39;
		System.out.println("Testing Random numbers:");
		Random randomNumber = new Random ();
		
		for (int i = 0; i<20; i = i +1) {
			System.out.println("Random number is " + randomNumber.nextInt(10));
		
		}
		
		
		// new + Object = constructor
		System.out.println("with new Human constructor:");
		Human kennyCheng = new Human ("Male", "5'9\"", "158 lbs", "brown");
		
		// before creating the setProperties method
//		kennyCheng.eyeColor = "brown";
//		kennyCheng.height = "5'9\"";
//		kennyCheng.weight = "158 lbs";
//		kennyCheng.gender = "Male";
		
		// after creating the setProperties method
		System.out.println("with serProperties method:");
		kennyCheng.setProperties("Male", "5'9\"", "158 lbs", "brown");
		
		System.out.println(kennyCheng.getInfo());
		
		Human ladyGaga = new Human ();
		
		ladyGaga.eyeColor = "brown";
		ladyGaga.height = "5'4\"";
		ladyGaga.weight = "130 lbs";
		ladyGaga.gender = "Female";
		
		System.out.println(ladyGaga.getInfo());

	}


}
