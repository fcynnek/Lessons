package com.coderscampus.Unit18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Unit18Application {

	public static void main(String[] args) {
		SpringApplication.run(Unit18Application.class, args);
	}

	/*
	 *  New dependencies to include for Spring:
	 *  -	Spring Data JPA -> brings in Java Hibernate which is needed to map out DTOs with getters and setters to DB
	 *  -	MySQL Driver -> brings in connector for MySQL
	 *  
	 *  The username and password should match the same credentials on MySQL
	 */
}
