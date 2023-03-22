package com.coderscampus.Unit15.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.coderscampus.Unit15.domain.Person;

@Repository
public class PersonRepository {

	private Map<Integer, Person> people = new HashMap<>();

	public Person save(Person person) {
		people.put(person.getId(), person);
		return person;
	}
	
	public Person findById(Integer personId) {
		return people.get(personId);
	}
	
}
