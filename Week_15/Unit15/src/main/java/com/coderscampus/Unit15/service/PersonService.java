package com.coderscampus.Unit15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Unit15.domain.Person;
import com.coderscampus.Unit15.repository.PersonRepository;

@Service
public class PersonService {
	
	Integer personId = 1;
	
	@Autowired
	private PersonRepository personRepo;
	
	public Person save(Person person) {
		person.setId(personId++);
		return personRepo.save(person);
		
	}

	public Person findById(Integer personId) {
		return personRepo.findById(personId);
		
	}

}
