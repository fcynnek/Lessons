package com.coderscampus.lesson9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.coderscampus.lesson5.Person;

public class SerializableApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Note: this implemented the serializable interface in Week5/Person
		
		Person trevor = new Person ("Trevor Page", 70);
		Person jane = new Person ("Jane Doe", 65);
		Person elon = new Person ("Elon Musk", 75);
		
		// using FileOutputStream because it is to leverage with serializable interface
//		FileOutputStream output = null;
//		try {
//			output = new FileOutputStream("people.txt");
//		} finally {
//			if (output != null)
//				output.close();
//		}
		
		// there is a cleaner version to close by using "try with resources" which means that whenever a method can implement or extend to a "closeable" property, it can be declared like an if statement
		try (FileOutputStream fileOutput = new FileOutputStream("people.txt"); ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
			objectOutput.writeObject(trevor);
			objectOutput.writeObject(jane);
			objectOutput.writeObject(elon);
		}
		System.out.println("------ output and input with serializable ------");
		loadPeopleFromFile ();
		
	}

	private static void loadPeopleFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fileInput = new FileInputStream("people.txt"); ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
			Person trevor = (Person) objectInput.readObject();
			// (Person) casting the type
			Person jane = (Person) objectInput.readObject();
			Person elon = (Person) objectInput.readObject();
			
			System.out.println(trevor.getName());
			System.out.println(jane.getName());
			System.out.println(elon.getName());
		}
	}

}
