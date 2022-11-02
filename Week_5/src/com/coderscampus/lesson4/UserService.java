package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserService {

	public User createUser (String username, String password) {
		// creating a new object (data type, variable name, assignment operator)
		User user = new User();
		user.setUsername(username);
		user.setUsername(password);
		return user;
	}
}
