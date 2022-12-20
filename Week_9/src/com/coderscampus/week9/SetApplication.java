package com.coderscampus.week9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApplication {

	public static void main(String[] args) {
		
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
}
