package com.coderscampus.Unit14.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Unit14.dto.Person;

@RestController
public class PersonController {

	@PostMapping("/persons")
//	public Person createPerson(@RequestParam String name, @RequestParam Integer age, @RequestParam(required = false) String gender) {
	// requestparam is considered as optional because Spring MVC + postmapping can detect the args passed in and it will determine that these
	//	are params. However, if no arg is passed for either of the args, then it passes a null input. Therefore, if the program requires 
	// 	required params, then it is better to add the @requestparam
	
	public Person createPerson(String name, Integer age, String gender) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		return person;
	}
	
	// For example: localhost:8080/persons/1
	// This fetches the person with ID #1
	@GetMapping("/persons/{personId}")
	public Person getPerson(@PathVariable Long personId) {
		return null;
	}
}
