package com.coderscampus.lesson1;

public class FileApplication {

	public static void main(String[] args) {

//		FileService fileService = new FileService();
		// cannot be instantiated because it is an interface and interfaces cannot be instantiated.
		
		FileServiceImpl fileService = new FileServiceImpl();
	}

}
