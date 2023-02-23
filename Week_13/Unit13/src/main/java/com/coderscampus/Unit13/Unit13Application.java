package com.coderscampus.Unit13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Unit13Application {

	/* 
	*  Spring Initializer: start.pring.io
	*  Configurations:
	*  Language:  Java
	*  Project: Maven
	*  Spring Boot: Use the current deployed to General Audience (GA)
	*    Can be found: spring.io/projects/spring-boot#learn
	*  Group: package address (ie. com.coderscampus)
	*  Artifact: Name of the project (ie. Unit13 or Assignment_8)
	*  Packaging: JAR
	*  Dependencies: For this lesson, only Spring Web
	*  Extract the folder in local repository directory
	*/ 
	
	/*
	 * Accessing the local host:
	 * 127.0.0.1 OR
	 * localhost:8080
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(Unit13Application.class, args);
	}

}
