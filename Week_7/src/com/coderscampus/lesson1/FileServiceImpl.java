package com.coderscampus.lesson1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileServiceImpl implements FileService, GenericService {

	@Override
	public String readLine(File file) throws IOException {
		// if we use the compilation error fixer to add the throws Exception, it gives an error because it is not stated in the Interface
		// <- <- <- see interface for further explanation <- <- <-
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			return reader.readLine();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}

	@Override
	public void writeLine(File file, String line) {
		
	}

	@Override
	public void logStuff() {
		System.out.println("Here's some logging for the FileServiceImpl class");
	}

}
