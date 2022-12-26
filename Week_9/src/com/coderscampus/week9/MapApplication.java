package com.coderscampus.week9;

import java.util.HashMap;
import java.util.Map;

public class MapApplication {

	public static void main(String[] args) {
		
		Map<Integer, String> people = new HashMap<>();
		// HashMaps stores data as key:value pairs
		// K (ey) / V (alue) 
		// Key is to uniquely identify something (ie a row of data in excel)
		
		// Key: SSN
		// Value: Person's name
		
		people.put(111111111, "Trevor Page");
		people.put(222222222, "Josh Someone");
		people.put(333333333, "Elon Musk");
		people.put(444444444, "Jane Doe");
		people.put(555555555, "Jeff Bezos");
		people.put(555555555, "John Doe");
		// this is how we update data by assigning a new value to the same key that previously had a different value
		
		System.out.println("Get data using an invalid key: ");
		System.out.println(people.get(123456789));
		
		System.out.println("\nGet data using a valid key: ");
		System.out.println(people.get(333333333));

		people.remove(555555555);
		// this is how we remove a value that was assigned to a key previously
		System.out.println("\nGet data after removing data using a valid key: ");
		System.out.println(people.get(555555555));
	}
}
