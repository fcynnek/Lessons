package com.coderscampus.lesson01;

public class StaticExample {

	// static = belongs to the class (StaticExample is the class), not an instance of the class
	// the class can go with the method or the class (main is a method here)
	// non-static (omit the word static) = belongs to the instance of the class (not the class itself)
	public static void main(String[] args) {
		StaticExample staticObject = new StaticExample ();
		
		if (staticObject.someNumber > 11) {
			System.out.println("Say something");
		}
		
		
		Human aChild = new Human ();
		aChild.age = 12;
		System.out.println(aChild.getStageOfLife());
	}

}
