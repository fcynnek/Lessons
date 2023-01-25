package com.coderscampus.lesson1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	// Test-Driven Development Methodology
	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make the test pass
	// Step 3 - Refactor your code
	
	@Test
	void should_add_one_item_to_list() {
		// Three A's
		// Arrange, Act, Assert
		
		// Arrange:
		CustomList<Integer> customList = new CustomArrayList<>();
		
		// Act: (invoking the code)
		customList.add(10);
		Integer expectedResult = customList.get(0);
		Integer expectedSize = customList.getSize();
		
		// Assert: 
		// What is expected to happen?
		//	Expected to have an integer with value 10 stored in the first index of the customList
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
	}
	
	@Test
	void should_add_11_items_to_list() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>(); // sut = system under test
		
		// Act
		for (int i=1; i<=11; i++) {
			sut.add(i);
		}
		
		// Assert
		for (int i=0; i<10; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(11, sut.getSize());
	}

	@Test
	void should_add_100000_items_to_list() {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>(); // sut = system under test

		// Act
		for (int i = 1; i <= 100000; i++) {
			sut.add(i);
		}

		// Assert
		for (int i = 0; i < 99999; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(100000, sut.getSize());
	}
}
