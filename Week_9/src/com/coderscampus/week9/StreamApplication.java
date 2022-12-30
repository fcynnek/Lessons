package com.coderscampus.week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApplication {

	public static void main(String[] args) {
		
//		example1();
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Tesla", "Model S", 2019));
		cars.add(new Car("Tesla", "Model S", 2018));
		cars.add(new Car("Tesla", "Model X", 2016));
		cars.add(new Car("Tesla", "Model 3", 2019));
		cars.add(new Car("Ford", "F150", 2017));
		cars.add(new Car("Toyota", "Corola", 1997));
		cars.add(new Car("Toyota", "Celica", 2002));
		
		List<String> models = cars.stream()
								  .map(car -> car.getModel()) // data type
								  .collect(Collectors.toList()); // collecting a list of models
		
		models.stream()
			  .forEach(model -> System.out.println(model));
		
		System.out.println("------------");
		
//		Set<String> brands = cars.stream()
//								 .map(car -> car.getBrand())
//								 .collect(Collectors.toSet());
//		
//		brands.stream()
//			  .forEach(brand -> System.out.println(brand));
		
		System.out.println("------------");
		
		String brands = cars.stream()
								 .map(car -> car.getBrand())
								 .distinct() // adding this function to only obtain unique values
								 .filter(brand -> brand.startsWith("T"))
								 .collect(Collectors.joining(", "));
		
		System.out.println(brands); // no need to stream because there is no intermediate action
	}

	public static void example1() {
		List<String> names = new ArrayList<>();
		
		populateNames(names);
		
		// old way to iterate through a list
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		// new way to iterate through a list (using Streams)
//		names.stream()
//		     .forEach((String name) -> {
//		    	 System.out.println(name);
//		     });
		// but this is too verbose
		
		// the streamlined version of the code above 
//		names.stream()
//			 .forEach(name -> System.out.println(name));
		
		// multi-threading: to make use all the CPU cores to perform this loop. Since this is executing them all at the same time, then it does not retain order
		names.parallelStream()
		 	 .forEach(name -> System.out.println(name));
	}

	private static void populateNames(List<String> names) {

		names.add("Nahla Kirkland");
		names.add("Charly Gay");
		names.add("Jamie-Lee Swan");
		names.add("Deen Markham");
		names.add("George Mckeown");
		names.add("Misha Ali");
		names.add("Tanya James");
		names.add("Taybah Wilkinson");
		names.add("Zac Holman");
		names.add("Kacie Dunlap");
	}
}
