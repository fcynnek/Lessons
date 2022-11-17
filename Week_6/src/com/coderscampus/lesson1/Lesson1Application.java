package com.coderscampus.lesson1;

public class Lesson1Application {

	public static void main(String[] args) {

		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		
		CompSciTeacher compSciTeacher = new CompSciTeacher();
		
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		
		QuantumPhysicsTeacher quantumTeacher = new QuantumPhysicsTeacher();
		
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
	}

}
