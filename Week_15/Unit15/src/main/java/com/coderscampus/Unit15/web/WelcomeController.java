package com.coderscampus.Unit15.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("") // empty = localhost:8080
	public String getRootWebpage() {
		// HTML files go under: src/main/resources -> templates{filename}.html
		// filename should match the return statement here
		return "welcome";
	}
}
