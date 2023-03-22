package com.coderscampus.Unit15.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.Unit15.domain.Person;

@Controller
public class WelcomeController {

	@GetMapping("") // empty = localhost:8080
	public String getRootWebpage(ModelMap model) {
		// HTML files go under: src/main/resources -> templates{filename}.html
		// filename should match the return statement here
		// IMPORTANT: New dependency: Thymeleaf
		// ModelMap is basically a hashmap (keys and values)
		
//		String firstname = "Kenny";
//		model.put("firstname", firstname);
		
		Person person = new Person();
		model.put("person", person);
		return "welcome";
	}
	
	@PostMapping("")
	public String postRootWebpage(Person person) {
		System.out.println(person);
		return "welcome";
	}
}
