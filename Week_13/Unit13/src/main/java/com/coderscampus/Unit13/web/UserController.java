package com.coderscampus.Unit13.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Unit13.service.UserService;

@RestController
public class UserController {

	// option 1:
	private UserService userService2;
	
	public UserController (UserService userService) {
		this.userService = userService;
	}
	
	// option 2
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String getUsers() {
		return userService.getMessage();
	}
}
