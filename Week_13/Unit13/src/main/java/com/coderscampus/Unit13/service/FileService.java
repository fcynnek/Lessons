package com.coderscampus.Unit13.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FileService {
	
	public List<String> readFile (String filename) throws IOException {
		return Files.readAllLines(Paths.get(filename));
	}

}
