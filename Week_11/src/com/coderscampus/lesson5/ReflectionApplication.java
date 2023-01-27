package com.coderscampus.lesson5;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class ReflectionApplication {

	@Test
	public void reflection_test() {
		
		Person person = new Person();
		person.setAge(18);
		person.setName("Julie Smith");
		person.setEyeColor("Brown");
		
		Method[] methods = person.getClass().getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
