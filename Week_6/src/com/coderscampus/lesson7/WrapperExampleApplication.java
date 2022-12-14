package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main(String[] args) {

		/**
		 * 				Wrapper Classes (upper case first letter)
		 * byte		->	Byte
		 * short	->	Short
		 * int		->	Integer
		 * long		->	Long
		 * float	->	Float
		 * double	->	Double
		 * char		->	Character
		 * boolean	-> 	Boolean
		 * 
		 **/
		
		int primitiveInt = 8;
		Integer wrapperInt = 7; // auto-boxing: when declaring a primitive as an object
		Integer anotherIntWrapper = Integer.valueOf(8);
		
		// un-boxing: assigning an object into a primitive
		primitiveInt = new Integer(9);
		primitiveInt = Integer.valueOf(9);
		
		String someNumber = "123";
		String SomeOtherNumber = "456";
		
		// a safer way to do string comparison to avoid
		// a NullPointerException
		if ("456".equals(SomeOtherNumber));
		
		System.out.println(someNumber + SomeOtherNumber);
		System.out.println(Integer.parseInt(someNumber) + Integer.parseInt(SomeOtherNumber));
		
		Boolean someBoolean = null;
		
		// this will have an error because by using the Boolean wrapper, it defines it as an object and not a boolean
//		if (someBoolean == true) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
		
		// a safer way to do boolean evaluation to avoid
		// a NullPointerException
		if (Boolean.TRUE.equals(someBoolean)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		long firstLong = 10L;
		long secondLong = 10L;
		
		if (firstLong == secondLong) {
			System.out.println("Primitive long comparison works!");
		}
		
		Long firstLongWrapper = new Long(10);
		Long secondLongWrapper = Long.valueOf(10);
		
		// this comparison does not work because these are objects and not primitive. Object comparison is done via .equals
		if (firstLongWrapper == secondLongWrapper) {
			System.out.println("Object wrapper Long comparison works!");
		}
	}

}
