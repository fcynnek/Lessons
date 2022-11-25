package com.coderscampus.lesson5;

import java.util.Arrays;
import java.util.Comparator;

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
		
		Person[] people = new Person[5];
		
		people[0] = new Person("Josh Allen", 72);
		people[1] = new Person("Trevor Page", 70);
		people[2] = new Person("Elon Musk", 74);
		people[3] = new Person("Jordan Bellfast", 71);
		people[4] = new Person("Jane Doe", 70);
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
	
		// if we cannot have access to the source code and modify the code to gain access to the comparable method,
		// there is another way to sort using the comparaTOR 
		
		// in this case, people variable is an array of person objects
		// assuming that the person class has no access to the compare method
		// Comparator needs to pass in the data type (in this case it is Person)
		
		System.out.println("----");
		Arrays.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person person1, Person person2) {
			// compare (Person 01, Person 02) Person is the data type. o1 and o2 are variable names
				return person1.getHeight().compareTo(person2.getHeight());
			}
		});
		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getHeight() + " inches tall.");
		}
		
		// another way of doing it is to create a whole new class implementing the comparator
		// ie. a class called PersonHeightComparator implements Comparator<Person>
		// implement the methods which will include the @override method in the new class
		// instead of new Comparator<Person>() in line 60, we can have new PersonHeightComparator()
	}
}
