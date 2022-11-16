package com.coderscampus.lesson08;

public class ExceptionExamples {

	public static void main(String[] args) {
		
		String someString = null;
		// assigning a value of null
		
		// to avoid exceptions:
		try {
			@SuppressWarnings({ "unused", "null" })
			String[] stringArray = someString.split(",");
			// hit a type of exception. A null pointer exception
			// access a property of an object as null
		} 
		catch (NullPointerException e) {
			System.out.println("Oops, there was a null pointer exception");
		}
		// use try when anticipating an exception that needs handling
		// exceptions are thrown by java and caught  
				
	}

}
