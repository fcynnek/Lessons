package com.coderscampus.week9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamApplication {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		populateNames(names);
		
		// old way to iterate through a list
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		// new way to iterate through a list (using Streams)
//		names.stream()
//		     .forEach((String name) -> {
//		    	 System.out.println(name);
//		     });
		// too verbose
		
		// the streamlined version of the code above 
//		names.stream()
//			 .forEach(name -> System.out.println(name));
		
		// multi-threading: to make use all the CPU cores to perform this loop. Since this is executing them all at the same time, then it does not retain order
		names.parallelStream()
		 	 .forEach(name -> System.out.println(name));
		
	}

	private static void populateNames(List<String> names) {

		names.add("Nahla Kirkland");
		names.add("Charly Gay");
		names.add("Jamie-Lee Swan");
		names.add("Deen Markham");
		names.add("George Mckeown");
		names.add("Misha Ali");
		names.add("Tanya James");
		names.add("Taybah Wilkinson");
		names.add("Zac Holman");
		names.add("Kacie Dunlap");
	}
}
