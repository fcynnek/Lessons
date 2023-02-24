package com.coderscampus.Unit13.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Unit13.domain.User;
import com.coderscampus.Unit13.service.FileService;

	/*
	 * Controllers: listen and sends the data that is being requested
	 * Rest Controller: allows the application to run w/o a UI -> used for data
	 */

@RestController
public class FileController {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private User user;
	
	
	// For @value ${xyz} the sign and curly brakets are to signify that the input passed in are keys and not values
	@Value("${superuser.username}")
	private String superuserUsername;
	
	@Value("${superuser.password}")
	private String superuserPassowrd;
	
	@Value("${superuser.name}")
	private String superuserName;
	
	
//	@GetMapping("") //empty "" means listening on the root of the application -> localhost:8080
//	public List<String> readLines() throws IOException {
//		return fileService.readFile("text.txt");
//	}
	
	@GetMapping("/read-lines")
	public List<String> readLines() throws IOException {
//		applicationContext.getBean(FileService.class); // grab the instantiated class from the autowire (line 23)
		// alternatively (not through Spring autowire):
		FileService fileService = applicationContext.getBean(FileService.class);
		System.out.println(user);
		
		System.out.println(superuserUsername);
		System.out.println(superuserPassowrd);
		System.out.println(superuserName);
		
		return fileService.readFile("text.txt");
	}
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@PostMapping("/hello-world")
	public String helloWorldPost() {
		return "Okay cool, you just posted some data!";
	}
}
