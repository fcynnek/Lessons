package com.coderscampus.lesson5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class ReflectionApplication {

	PersonRepository personRepo = new PersonRepository();
	CatRepository catRepo = new CatRepository();
	CarRepository carRepo = new CarRepository();
	
	@Test
	public void reflection_test() {
		
		Person person = new Person();
		person.setAge(18);
		person.setName("Julie Smith");
		person.setEyeColor("Brown");
		
		Cat cat = new Cat();
		Car car = new Car();
		
		Method[] methods = person.getClass().getMethods();
		// getClass wants either 1) getMethod or 2) getMethods
		// getMethods will return more than one which means that it requires an Array
		// Therefore, Method[]
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		save(person, personRepo);
		save(cat, catRepo);
		save(car, carRepo);
	}
	
	public <T, R> void save (T obj, R repo) {
		// now passing in the repo in the arguments so there is no need to get repo name and class and methods
		
		Class<T> c = (Class<T>) obj.getClass();
//		String nameOfClass = c.getName();
//		String nameOfRepository = nameOfClass + "Repository";
		
		try {
//			Class<?> repositoryClass = Class.forName(nameOfRepository);
//			Method saveMethod = repositoryClass.getMethod("save");
			Method saveMethod = repo.getClass().getMethod("save", c);
			saveMethod.invoke(repo, obj);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.err.println("Oops there was an error geeting the save method");
//			e.printStackTrace();
		}
	}
	
	public void save (Person person) {
		// get a Repository and call the save method on the repo
		// Example:
		PersonRepository personRepository = new PersonRepository();
		personRepository.save(person);
	}
	
	public void save (Cat cat) {
		
		CatRepository catRepository = new CatRepository();
		catRepository.save(cat);
	}
	
	public void save (Car car) {
		
		CarRepository carRepository = new CarRepository();
		carRepository.save(car);
	}
}
