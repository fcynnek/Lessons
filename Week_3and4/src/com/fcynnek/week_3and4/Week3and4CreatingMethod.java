package com.fcynnek.week_3and4;

import java.util.Scanner;

public class Week3and4CreatingMethod {

public static void main (String[] args) {
		
//		userInput();
		validatingUserInput(userInput());
		
	}

public static int userInput() {
	
	Scanner scanner = new Scanner (System.in);
	System.out.println("Type a number between 50 and 300: ");
	
	String input = scanner.nextLine();
	Integer convertedInput = Integer.parseInt(input);
	
	scanner.close();
	return convertedInput;
	
}

public static void validatingUserInput(int i) {
	
	int convertedInput = i;
	
	if (convertedInput < 50) {
		System.out.println("The number you typed in was: " + null);
	}
	
	else if (convertedInput > 300) {
		System.out.println("The number you typed in was: " + null);
	}
	
	else {
		System.out.println("The number you typed in was: " + convertedInput);
	}
}

}
