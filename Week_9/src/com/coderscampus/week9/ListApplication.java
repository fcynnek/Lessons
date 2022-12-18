package com.coderscampus.week9;

import java.util.ArrayList;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {

		String[] names = new String[4];
		// a limitation to using Arrays is that it always need the size of the array

//		names[1] = "Trevor Page";
//		names[2] = "";
//		names[3] = "";
//		names[4] = "";
		// this will give an out of bound error because Java is a 0 base index
		// so the first index for [4] is i=0 and the highest is i=3
		
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
		
		// there are solutions for these type of problems:
		// Collections -> Java solution to common data structure problems
		// List (a type of collection)
		// Set (a type of collection)
		// Map (a type of collection)
		
		// need to import List from Java.Util
		List<String> elements = new ArrayList<String>();
	}
}
