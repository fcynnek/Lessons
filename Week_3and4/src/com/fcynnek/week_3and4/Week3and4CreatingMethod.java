package com.fcynnek.week_3and4;

import java.util.Scanner;

public class Week3and4CreatingMethod {

public static void main (String[] args) {

	System.out.println("Type a number between 50 and 300: ");
	
	Scanner scanner = new Scanner (System.in);
	
	int lastNumber = userInput(scanner);
	
		boolean callingUserInput = validatingUserInput(lastNumber);
		
		while (callingUserInput == false) {
			
			System.out.println("Oops, that number wasn't between 50 and 300, try again: ");
			
			lastNumber = userInput(scanner);
			
			callingUserInput = validatingUserInput(lastNumber);	
		}
		System.out.println("The number you typed in was: " + lastNumber);
		
		scanner.close();
	}

public static int userInput(Scanner scanner) {
	
	String input = scanner.nextLine();
	
	Integer convertedInput = Integer.parseInt(input);
	
	return convertedInput;
	
}

public static boolean validatingUserInput(int i) {
	
	int convertedInput = i;
	
	if (convertedInput < 50) {
//		System.out.println("The number you typed in was: " + null);
		return false;
	}
	
	else if (convertedInput > 300) {
//		System.out.println("The number you typed in was: " + null);
		return false;
	}
//	
//	else {
//		System.out.println("The number you typed in was: " + convertedInput);
//	}
	return true;
	}
		
}


