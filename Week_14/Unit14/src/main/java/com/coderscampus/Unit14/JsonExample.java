package com.coderscampus.Unit14;

import org.junit.jupiter.api.Test;

import com.coderscampus.Unit14.dto.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample {

	/*
	 * JSON = JavaScript Object Notation
	 * A simple String based way to notate data
	 * 	- Key : Value pairs
	 * 	- Key : Value pairs are separated by commas
	 * 	- Objects are represented by { }
	 * 	- Arrays are represented by [ ]
	 * 
	 * Note: JSON is NOT tied to JavaScript. It is language agnostic
	 * 	In other word: it will work in any language
	 * 
	 * For example: Person: name, age, gender
	 * 
	 * 		{
	 * 			"name"		: "Trevor Page",
	 * 			"age" 		: 37,
	 * 			"gender"	: "Male"
	 * 		}
	 * 
	 * For example: List<Person> people (for example an array of 2)
	 * 
	 * 	[
	 * 		{
	 * 			"name"		: "Trevor Page",
	 * 			"age" 		: 37,
	 * 			"gender"	: "Male"
	 * 		}, <- comma to separate the objects
	 * 		{
	 * 			"name"		: "Jane Doe",
	 * 			"age" 		: 29,
	 * 			"gender"	: "Female"
	 * 		}
	 * 	]
	 * 
	 * 	If these were in XML:
	 * 
	 * 	<people>
	 * 		<person>
	 * 			<name>Trevor Page</name>
	 * 			<age>37</age>
	 * 			<gender>Male</gender>
	 * 		</person>
	 * 		<person>
	 * 			<name>Jane Doe</name>
	 * 			<age>29</age>
	 * 			<gender>Female</gender>
	 * 		</person>
	 * 	</people>
	 */
	
	// technology used: Jackson Databind from https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
	// but Spring Boot had already created the dependency
	
	@Test
	public void convertJsonStringToJavaObj() throws JsonMappingException, JsonProcessingException {
//		String jsonString = "{"name": "Trevor Page", "age" : 37, "gender" : "Male"}"
		// trick: paste the string in between "" and it will paste it with the right compilation
		String jsonString = "{\"name\": \"Trevor Page\", \"age\" : 37, \"gender\" : \"Male\"}";
		
		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(jsonString, Person.class);
		System.out.println("Example 1 -> Turning JSON String into Java Object:");
		System.out.println(person);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		// Now doing the inverse -> taking a Java object and turning it to JSON string
		System.out.println("----------");
		System.out.println("Example 2 -> Turning Java Object into JSON String");
		
		person.setAge(person.getAge() + 1);
		
		System.out.println(mapper.writeValueAsString(person));
	}
	
}
