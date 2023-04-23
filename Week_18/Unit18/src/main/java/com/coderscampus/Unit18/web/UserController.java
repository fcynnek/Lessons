package com.coderscampus.Unit18.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.Unit18.domain.User;
import com.coderscampus.Unit18.service.UserService;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String getAllUsers (ModelMap model) {
		List<User> users = userService.findAll();
		model.put("users", users);
		return "users";
	}
	
	@GetMapping("/users/{userId}")
	public String findById (ModelMap model, @PathVariable Long userId) {
		User user = userService.findById(userId);
		model.put("users", Arrays.asList(user));
		model.put("user", user);
		return "users";
	}
	
	@GetMapping("/register")
	public String getNewUser(ModelMap model) {
		model.put("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String createUser (User user) {
		System.out.println(user);
		userService.saveUser(user);
		return "redirect:/register";
		// always return a redirect when postmapping
	}
	
	@PostMapping("/users/{userId}")
	public String postOneUser (User user) {
		// @PathVariable Long userId not needed on the arguments
		userService.saveUser(user);

		return "redirect:/users/" + user.getUserId();
	}
	
	@PostMapping("/users/{userId}/delete")
	public String deleteOneUser (@PathVariable Long userId) {
		userService.delete(userId);
		return "redirect:/users";
	}
}
