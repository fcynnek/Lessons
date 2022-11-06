package com.coderscampus.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) {
		
		// older way to read files
		// object type
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			// syso to address object not being used
//			System.out.println(fileReader.toString());
			
			// while example #1
			// initializing it with empty string
//			String line = "";
//			while (line != null) {
//				try {
//					line = fileReader.readLine();
//				} catch (IOException e) {
//					System.out.println("Oops, there was an I/O Exception");
//					e.printStackTrace();
//				}
//				System.out.println(line);
//			}
			// this method returns a null on the last line because it has to read the last
			// line to find out that it is null but still will print it because it is already
			// read and processed
			
			// while example #2 (more refined)
			String line;
			try {
				while ((line = fileReader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				System.out.println("Oops, there was an I/O Exception");
				e.printStackTrace();
			}
			// this is more refined because the check happens at the same time as the while
			// so as the line returns null while inside the while loop, then it breaks and
			// does not print
			
//			try {
//				System.out.println(fileReader.readLine());
//				// same code 6 times, 6th line is null at the end of the file
//			} catch (IOException e) {
//				System.out.println("Oops, there was an I/O Exception");
//				e.printStackTrace();
//			}
		} catch (FileNotFoundException e) {
			System.out.println("Oops, the file wasn't found");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		// this is trying to find for data.txt in the root folder
		// to create a new file, go to the main root (ie Week5) > New > File
	}

}
