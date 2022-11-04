package com.coderscampus.lesson8;

public class StringManipulation {

	public static void main (String[] args) {
		
		// for each loop
		for (String arg : args) {
			System.out.println(arg);
			
			// converting csv passed as args into strings
			// 1,2,3,4,5... -> [0]="1", [1]="2", [2]="3", [3]="4", ...
			// to pass arguments with java:
			// run arrow > run configuration > Java project > Arguments > input arguments
			
			String[] numbersArray = arg.split(",");
			for (String number : numbersArray) {
				System.out.println(number);
			}
			
		}
	}
}
