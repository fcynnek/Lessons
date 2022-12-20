package com.coderscampus.week9;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApplication {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<>();
		// because we had already declared the data type List<Integer>, it is not necessary to type <Integer> 
		// in LinkedList because the data type is already declared. BUT the empty <> need to be there

		// LinkList
		// Head=1			Head=0			Head=0			Head=0
		// Tail=0	<->		Tail=0	<->		Tail=0	<->		Tail=1
		// (10)				(20)			(30)				(40)
		// The difference on LinkList and ArrayList is that LinkList only requires 4 operations to remove an element
		// 1) go to the head of list, 2) find the object, 3) update it as new position, 4) remove previous object
		// ArrayList will require manual "moving" of objects into the previous position after removal of object
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers);
		System.out.println("");
		
		numbers.remove(0);
		System.out.println(numbers);
		System.out.println("");
		
//		numbers.remove(30);
//		System.out.println(numbers);
		// the problem with this is that it is expecting an index i=30 but the list only has 3 
		// therefore, this creates an out of bounds 
		// instead, we should use casting if we want to make an integer into an object
		
		numbers.remove((Integer)30);
		System.out.println(numbers);
	}

}
