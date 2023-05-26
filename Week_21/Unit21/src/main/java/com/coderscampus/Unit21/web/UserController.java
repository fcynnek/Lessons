package com.coderscampus.Unit21.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	/*
	 * Instead of having different @GetMapping with the initial starting end point "/users" we extract it with a @RequestMapping
	 * For example: instead of @GetMapping("/users/exists") -> @GetMapping("/exists")
	 */
	
	@GetMapping("/exists")
	public Boolean getExists (String username, String password) {
		System.out.println("Username: " + username + "/n Password: " + password);
		return true;
	}
	
	@GetMapping("/validateUsername") 
	public Boolean getValidUsername (String name) {
		return true;
	}
	
	@GetMapping("/validatePassword") 
	public Boolean getValidPassword (String password) {
		return true;
	}
}
