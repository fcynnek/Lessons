package com.coderscampus.lesson2;

import com.coderscampus.lesson1.Human;

public class AccessModifiers {

	// Access Modifiers = private, public, protected
	public static void main(String[] args) {
		Human kennyCheng = new Human();
		System.out.println("Example 1");
		kennyCheng.setAge(35); // using the getter and setter from the Human class
//		kennyCheng.age= 35; // error on .age because it is set as private and cannot be accessed
		kennyCheng.setAge(35); // this one works because it is accessing public setter and getter
		
		// this should give an error because the visibility is not set as public
		System.out.println(kennyCheng.getStageOfLife());
		
		System.out.println("Example 2");
		kennyCheng.setAge(-1);
		System.out.println(kennyCheng.getAge());
		
		kennyCheng.setAge(160);
		System.out.println(kennyCheng.getAge());
		
		kennyCheng.setAge(35);
		System.out.println(kennyCheng.getAge());
	}

}
