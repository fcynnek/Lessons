package com.coderscampus.lesson5;

import java.util.Arrays;

public class SortingApplication {

	public static void main(String[] args) {

		String[] sortableStrings = new String[4];
		
		sortableStrings[0] = "Josh Allen";
		sortableStrings[1] = "Trevor Page";
		sortableStrings[2] = "Elon Musk";
		sortableStrings[3] = "Jordan Bellfast";
		
		System.out.println("presorting");
		for(String sortableString : sortableStrings) {
			System.out.println(sortableString);
		}
		System.out.println("----");
		System.out.println("postsorting");
		Arrays.sort(sortableStrings);
		// sorting Strings
		for (String sortableString : sortableStrings) {
			System.out.println(sortableString);
		}
		
		System.out.println("----");
		System.out.println("sorting with comparable method");
		
		Person[] people = new Person[4];
		
		people[0] = new Person("Josh Allen", 72);
		people[1] = new Person("Trevor Page", 70);
		people[2] = new Person("Elon Musk", 74);
		people[3] = new Person("Jordan Bellfast", 71);
		Arrays.sort(people);
		
		// runtime exception because it needs a comparable object to be sorted
		// because it cannot sort an undefined array of person objects 
//		for (Person person : people) {
//			System.out.println(person.getname());
//		}
	
		// now that we have defined the sorting method (using comparable) we had defined that the sorting is done by height
		for (Person person : people) {
			System.out.println(person.getName());
	}
	
	}
}
