package com.coderscampus.lesson8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputApplication {

	public static void main(String[] args) throws IOException {

		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("data.txt"));
			writer.write("This is a test string that will be output into a file.\n"); // "\n" creates a new line
			writer.write("Is this line of text on a new line?");
		} finally {
			if (writer != null) {
				// there is an if statement to catch the null initiation in case it tries to close the writer that was never assigned a value
				writer.close();
			}
		}
		
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("data.txt"));
			System.out.println(reader.readLine());
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}

}
