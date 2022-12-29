package com.coderscampus.week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Trevor Page");
		names.add("John Doe");
		names.add("Jane Doe");
		names.add("Elon Musk");
		names.add("Josh Someone");
		
		// sorting arrays is Arrays.sort
		// sorting array lists is collections.sort
		
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		// lambda expression
		// on the left side of the lambda: the method signature (in this case the compare
		// on the right side of the lambda: the return statement
		
		// example 1 of creating a lambda expression
		Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
		
		// example 2, slightly more "verbose"
		// adding the data types
		Collections.sort(names, (String o1, String o2) -> o2.compareTo(o1));
		
		// example 3, even more "verbose"
		Collections.sort(names, (String o1, String o2) -> {
			if (o2 != null && 01 != null) {
				return o2.compareTo(o1);
			} else {
				return 0;
			}
		});
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
		
		
//		example1();
		
		// there are solutions for these type of problems:
		// Collections -> Java solution to common data structure problems
		// List (a type of collection)
		// Set (a type of collection)
		// Map (a type of collection)
		
		// need to import List from Java.Util
//		example2();
	}

	public static void example2() {
		List<String> elements = new ArrayList<String>();
		
		elements.add("Trevor Page");
		elements.add("John Doe");
		elements.add("Jane Doe");
		elements.add("Elon Musk");
		
		System.out.println("");
		System.out.println("List example:");
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("");
		System.out.println("Remove example:");
		elements.remove(0);
		elements.remove("Jane Doe");
		for (String element : elements) {
			System.out.println(element);
		}
	}

	public static void example1() {
		String[] names = new String[4];
		// a limitation to using Arrays is that it always need the size of the array

//		names[1] = "Trevor Page";
//		names[2] = "";
//		names[3] = "";
//		names[4] = "";
		// this will give an out of bound error because Java is a 0 base index
		// so the first index for [4] is i=0 and the highest is i=3
		
		System.out.println("Array example:");
		names[0] = "Trevor Page";
		names[1] = "Jane Doe";
		names[2] = "John Doe";
		names[3] = "Elon Musk";
		// if we want to add a new array to [names], we can't because we had reached the limit this array can contain
		// removing is also a limitation. We can say:
		
		names[1] = null;
		
		for (String name : names) {
			System.out.println(name);
		// this does not completely solve the removing because there is a null in position [1] and ideally, 
		// we would want the [2] and [3] content to shift up and leave the null in the last position
		}
	}
}
