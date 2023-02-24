package com.coderscampus.Unit13.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service // this creates a singleton which means that it only instantiates it once and every subsequent call will refer to this prime
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // this creates multiple instantiations of the service
public class FileService {
	
	private String fileName;
	
	public FileService (String fileName) {
		this.fileName = fileName;
	}
	
	public List<String> readFile () throws IOException {
		return Files.readAllLines(Paths.get(fileName));
	}

}
