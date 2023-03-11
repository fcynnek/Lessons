package com.coderscampus.Unit14.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.coderscampus.Unit14.dto.Person;

@Repository
public class PersonRepository {
	private Map<Long, Person> personsData = new HashMap<>();

	public void save (Person person) {
		personsData.put(person.getId(), person);
	}

	public Person findById(Long personId) {
		return personsData.get(personId);
	}
	
}
