package com.coderscampus.lesson2;

public class GenericFactoryApplication {

	public static void main(String[] args) {
		
		// interface is mostly used to force objects that could be different from each other to implement functionality
		// abstracts classes are mostly used when the objects are similar to each other
		
		GenericFactory carFactory = new CarFactory() ;
		Body body = new Body();
		Frame frame = new Frame();
		Electronics electronics = new Electronics();
		
		Part[] parts = new Part[3];
		parts[0] = body;
		parts[1] = frame;
		parts[2] = electronics;
		
		Product car = carFactory.build(parts);
		System.out.println("we've built a new car: " + car);
		
		
		
	}

}
