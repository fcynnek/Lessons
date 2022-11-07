package com.coderscampus.lesson04;

import com.coderscampus.lesson03.User;

public class UserApplication {

	public static void main(String[] args) {
		// [] Arrays allow us to store multiple objects (or primitives) into ONE variable
		// NOTE: an Array is one type of Data Structure
		
		UserService userService = new UserService();
		User[] users = new User[5]; // ie. 5 new users
		
		// creating users as an array
		users[0] = userService.createUser("user1", "password1");
		// 1, 2, 3, 4, etc.
		
		for (int i = 0; i < 5; i++) {
			users[i] = userService.createUser("user" + (i+1), "password123");
		}
		
		// creating users calling userService class
		User kennyUser = userService.createUser("kenny@email.com", "password123");
		System.out.println(kennyUser);
		

	}

}
