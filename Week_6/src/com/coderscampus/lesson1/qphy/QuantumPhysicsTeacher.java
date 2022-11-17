package com.coderscampus.lesson1.qphy;
//moved this class to its own package which means that now it needs to import Teacher from lesson1 package in order to compile

import com.coderscampus.lesson1.phys.PhysicsTeacher;

public class QuantumPhysicsTeacher extends PhysicsTeacher {

	public QuantumPhysicsTeacher () {
		System.out.println("Inside the QuantumPhysicsTeacher constructor");
		this.setClasses("QPHY 101, QPHY 201");
		this.setLevelOfEducation(getLevelOfEducation());
	}
}
