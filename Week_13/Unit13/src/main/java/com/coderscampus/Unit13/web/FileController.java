package com.coderscampus.Unit13.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Unit13.service.FileService;

	/*
	 * Controllers: listen and sends the data that is being requested
	 * Rest Controller: allows the application to run w/o a UI -> used for data
	 */

@RestController
public class FileController {

	@Autowired
	private FileService fileService;
	
//	@GetMapping("") //empty "" means listening on the root of the application -> localhost:8080
//	public List<String> readLines() throws IOException {
//		return fileService.readFile("text.txt");
//	}
	
	@GetMapping("/read-lines")
	public List<String> readLines() throws IOException {
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
