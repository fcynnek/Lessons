package com.fcynnek.week_3and4;

import java.util.Scanner;

public class MethodUserInputs {

	public static void userInput() {
		System.out.println("Type a number between 50 and 300: ");
	
	}
	
	public static void returnValues() {
		int convertedInput = 0;
		
		if (convertedInput < 50) {
			System.out.println("No");
		}
		
		else if (convertedInput > 300) {
			System.out.println("No!");
		}
		
		else {
			System.out.println("Yes!");
		}
	}
}
