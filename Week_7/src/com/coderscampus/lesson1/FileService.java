package com.coderscampus.lesson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileService {
// interfaces are contracts for methods where only methods are written here but no body of the methods
// it is an outline for the implementation of the methods
	
	// these are methods but it doesn't accept bodies = therefore, no {} 
	
	// it is also not allowed to declare private and protected methods in any interface
	
	String standardFileName = "data.txt";
	
	String readLine (File file) throws IOException;
	// the solution is to cut and paste the error solution into the appropriate implementation method

	void writeLine (File file, String line) throws IOException;
}
