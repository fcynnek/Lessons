package com.coderscampus.week9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApplication {

	public static void main(String[] args) {
		
//		example1();
		
		Set<Person> people = new HashSet<>();
		
		people.add(new Person(111111111, "Trevor", "Page"));
		people.add(new Person(111111111, "Trevor2", "Page2"));
		// Java needs to know that these 2 people are the same and that the 2nd entry is a duplicate
		people.add(new Person(111111112, "Trevor", "Page"));
		// this will output because the ssn returned true for being unique 
		
		for (Person person : people) {
			System.out.println(person);
			// this will call the toString because it will override the output as declared
		}
		
		Set<String> uniqueNames = new HashSet<>();
		// HashSets do NOT maintain order
		
		uniqueNames.add("Trevor Page");
		uniqueNames.add("Elon Musk");
		uniqueNames.add("Jane Doe");
		uniqueNames.add("Josh Someone");
		
		for (String uniqueName : uniqueNames) {
			System.out.println(uniqueName);
		}
	}

	public static void example1() {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();
		// LinkedHashSet maintains order
		
		uniqueNumbers.add(1);
		uniqueNumbers.add(2);
		uniqueNumbers.add(3);
		uniqueNumbers.add(4);
		uniqueNumbers.add(5);
		uniqueNumbers.add(6);
		uniqueNumbers.add(1); // this will not print because it is a duplicate
		
		for (Integer uniqueNumber : uniqueNumbers) {
			System.out.println(uniqueNumber);
		}
	}
}
