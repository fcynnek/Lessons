package com.coderscampus.lesson1;

public class QuantumPhysicsTeacher extends PhysicsTeacher {

	public QuantumPhysicsTeacher () {
		System.out.println("Inside the QuantumPhysicsTeacher constructor");
		this.setClasses("QPHY 101, QPHY 201");
		this.setLevelOfEducation(getLevelOfEducation());
	}
}
