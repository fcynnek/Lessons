package com.coderscampus.lesson4;

//public class Transformer <T1, T2> {
public class Transformer {

	// compilation error: cannot make static reference to non static types <T1, T2>
	// solution: move the data types from the class level into the method
	// static is useful because there is no need to instantiate the method in order to use it
	
	public static <T1, T2> String join(T1 v1, T2 v2) { 
		return v1.toString() + " -> " + v2.toString();
	}
}
