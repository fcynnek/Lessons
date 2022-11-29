package com.coderscampus.lesson7;

public class RegExApplication {

	public static void main(String[] args) {
		// regular expression are for validating inputs and expressions that matches the pattern we are looking for
		// "valid" email address :	fake.email@gmail.com
		// invalid email address :	trevorcraftycodr.com
		// invalid email address :	trevor@craftycodr.thisisntarealdomain
		// valid email address	 :	trevor@craftycodr.com
		// valid email address	 :	trevor-page.2@gmail.com
		// valid email address	 :	Trevor@CraftyCodr.com
		// basically: pattern matching
		
		//		String input = "fake.email@gmail.com";
		
		// the trick is to have a lot of test cases of valid and invalid cases
		// input. matches have an innate check for regex which returns true or false 
		
		// Google: java regex examples
		// vogella.com -> common matching symbols
		// regextester.com -> to test the regular expressions
		
																			// Expected results:
		inputMatchesRegExPattern("fake.email@gmail.com");					// valid
		inputMatchesRegExPattern("trevorcraftycodr.com");					// invalid
		inputMatchesRegExPattern("trevor@craftycodr.thisisntarealdomain");	// invalid
		inputMatchesRegExPattern("trevor@craftycodr.com");					// valid
		inputMatchesRegExPattern("trevor-page.2@gmail.com");				// valid
		inputMatchesRegExPattern("Trevor@CraftyCodr.com");					// valid

	}

	private static void inputMatchesRegExPattern(String input) {
		boolean matchFound = input.matches("^[a-zA-Z0-9][a-zA-Z0-9-]{0,}\\.?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{1,5}$"); 
		System.out.println("For input " + input + ", match found = " + matchFound);
		
		// [a-z]+.?[a-z]+@[a-z]+.[a-z]{1,5}
			// Breakdown:
			// [a-] 	-> "-" denotes range. Range from a to z
			// +		-> "what came before". 1 or more characters that came before from lower case a to z
			// .?		-> "?" denotes optional. If a dot precedes it is optional
			// @		-> 1 at symbol. Not optional (no ?)
			// {1,5}	-> range between 1 and up to 5 letters within the range of [a-z]
		
		// Tweaking the RegEx: [a-z0-9][a-z0-9-]{0,}.?[a-z0-9]+@[a-z0-9]+.[a-z]{1,5}
			// Breakdown:
			// [a-z0-9]		-> range now encompasses letters from a-z and 0-9
			// [a-z0-9-]	-> "-" at the end denotes that there could be a hyphen. Note: not on the previous block because an email address cannot start with a hyphen
			// {0,}			-> denotes that the previous expression can have 0 or more
		
		// More tweaking: ^[a-zA-Z0-9][a-zA-Z0-9-]{0,}.?[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]{1,5}$
			// Breakdown:
			// [a-zA-Z]		-> including upper case A-Z to the expression
			// ^			-> to match the beginning of the line (no spaces)
			// $			-> to match the end of the line (no spaces)
			// \\.			-> need to escape the . with a \ (-> \.) because the dot is a reserved character to "match any character"
			//				-> the second \ is to escape the regular expression escaping the \. (passing in the backslash to be able to escape the dot)
		
		// Actual RegEx for email validation:
		// ^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$
		
	}

}
