package com.coderscampus.lesson1;

import com.coderscampus.lesson1.compsci.CompSciTeacher;
import com.coderscampus.lesson1.phys.PhysicsTeacher;
import com.coderscampus.lesson1.qphy.QuantumPhysicsTeacher;
// moved these classes to their own package which means that now it needs to import them in order to compile

public class Lesson1Application {

	// Access modifiers in Java are: public, protected, package, private
	public static void main(String[] args) {

		PackageAccessModifierExample example = new PackageAccessModifierExample();
		System.out.println(example.someValue);
		
//		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
		Teacher physicsTeacher = new PhysicsTeacher();
		// casting because the class type of teacher is in the PSY class and not the Teacher class
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
//		((PhysicsTeacher)physicsTeacher).teach("Trevor Page");
		// therefore, compilation error
		// casting: put the class in () in front of variable to cast it
		// to access the method inside the class
		
		// more common way to cast:
		// this is an alternative to casting but it is more verbose
		PhysicsTeacher castedPhyTeacher = (PhysicsTeacher)physicsTeacher;
		castedPhyTeacher.teach("Trevor Page");
		
		// another way of casting / without having to create a new variable like ^^
		// using the existing definition/existing variable
		// take the parent class and cast it to the child class type
		// wrap in parenthesis + dot (.) + the method/function
		((PhysicsTeacher)physicsTeacher).teach("Trevor Page");
		
		// leveraging the casted function here to access the protected method which is declared under the Teacher class
		((PhysicsTeacher)physicsTeacher).markPapers();
		
		// private packages are only accessible in the scope of the class
		// so if we instantiate the class in here, it wouldn't still be accessible
		Teacher aGenericTeacher = new Teacher();
//		aGenericTeacher.giveARaise();
		
		
		CompSciTeacher compSciTeacher = new CompSciTeacher();
		
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		
		QuantumPhysicsTeacher quantumTeacher = new QuantumPhysicsTeacher();
		
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
	}

}
