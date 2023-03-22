package com.coderscampus.Unit15.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.Unit15.domain.Person;
import com.coderscampus.Unit15.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private ApplicationContext appContext;
	
	@GetMapping("/persons") // empty = localhost:8080
	public String getPeople(ModelMap model) {
		// HTML files go under: src/main/resources -> templates{filename}.html
		// filename should match the return statement here
		// IMPORTANT: New dependency: Thymeleaf
		// ModelMap is basically a hashmap (keys and values)
		
//		String firstname = "Kenny";
//		model.put("firstname", firstname);
		
//		Person person = appContext.getBean(Person.class);
		Person person = new Person();
		model.put("person", person);
		return "people";
	}
	
	@GetMapping("/persons/{personId}")
	public String getPerson(@PathVariable Integer personId, ModelMap model) {
		Person person = personService.findById(personId);
		model.put("person", person);
		return "people";
	}
	
	@PostMapping("/persons")
	public String postPeople(Person person) {
//		PersonService personService = appContext.getBean(PersonService.class);
		Person savedPerson = personService.save(person); 
		System.out.println(savedPerson);
		// controllers should never call the repository directly. Instead the Service should be doing that
		
		// a side effect of returning welcome is that the data that was sent to the model will continue to show after submit
//		return "welcome";
		
		// a solution is to return redirect. Redirect below returns to the root
		return "redirect:/persons";
	}
}
