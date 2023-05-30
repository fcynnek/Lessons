package com.coderscampus.Unit21.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Unit21.domain.User;

//@RestController //we need this to behave like a controller now after adding the register end point how some of these methods still need to behave like a rest controller
@Controller
@RequestMapping("/users")
public class UserController {

	/*
	 * Instead of having different @GetMapping with the initial starting end point "/users" we extract it with a @RequestMapping
	 * For example: instead of @GetMapping("/users/exists") -> @GetMapping("/exists")
	 */
	
//	@GetMapping("/exists")
//	public Boolean getExists (String username, String password) {
//		System.out.println("Username: " + username + "/n Password: " + password);
//		return true;
//	}
	
	@PostMapping("/exists")
	/*
	 *  in order for the app to be able to behave like a rest controller, we add the below annotation
	 *  the different between a controller and a rest controller is that a controller returns a "view" like the getRegister()
	 *  a rest controller returns an object
	 */
	@ResponseBody
	public Boolean postExists (@RequestBody User user) {
		System.out.println("Username: " + user.getUsername() + "/n Password: " + user.getPassword());
		return true;
	}
	
	@GetMapping("/validateUsername") 
	@ResponseBody
	public Boolean getValidUsername (String name) {
		return true;
	}
	
	@GetMapping("/validatePassword") 
	@ResponseBody
	public Boolean getValidPassword (String password) {
		return true;
	}
	
	@GetMapping("/register")
	public String getRegister (ModelMap model) {
		User user = new User();
		model.put("user", user);
		return "register";
	}
}
