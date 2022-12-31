package com.coderscampus.week9;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApplication {

	public static void main(String[] args) {
		
//		example1();
//		example2();
		example3();
		
//		List<Integer> numbers = new ArrayList<>(); // normal list of integers
		List<List<Integer>> listOfNumbersList = new ArrayList<>();
		
		listOfNumbersList.add(Arrays.asList(1,2,3));
		listOfNumbersList.add(Arrays.asList(2,3,4));
		listOfNumbersList.add(Arrays.asList(3,4,5));
		listOfNumbersList.add(Arrays.asList(4,5,6));
		listOfNumbersList.add(Arrays.asList(5,6,7));
		listOfNumbersList.add(Arrays.asList(6,7,8));
		
		long integerCount = listOfNumbersList.stream()
						 					 .flatMap(x -> x.stream())
//											 .collect(Collectors.joining(",")); 
											 .count();
		
		System.out.println("Count with Stream:");
		System.out.println(integerCount + "\n");
		
		long integerSum = listOfNumbersList.stream()
											 .flatMap(x -> x.stream())
											 .mapToInt(x -> x.intValue()) 
											 .sum();
		
		System.out.println("Sum with Stream:");
		System.out.println(integerSum + "\n");
		
		IntSummaryStatistics statSum = listOfNumbersList.stream()
														.flatMap(x -> x.stream())
														.mapToInt(x -> x.intValue()) 
														// the above line can also appear as:
//														.mapToInt(Integer::intValue)
														.summaryStatistics();

		System.out.println("Summary Statistics with Stream:");
		System.out.println(statSum);
	}

	private static void example3() {
		
		List<Car> cars = new ArrayList<>();

		cars.add(new Car("Tesla", "Model S", 2019));
		cars.add(new Car("Tesla", "Model S", 2018));
		cars.add(new Car("Tesla", "Model X", 2016));
		cars.add(new Car("Tesla", "Model 3", 2019));
		cars.add(new Car("Ford", "F150", 2017));
		cars.add(new Car("Toyota", "Corola", 1997));
		cars.add(new Car("Toyota", "Celica", 2002));
		
		// Grouping with Streams
		
		// Example of how it would group:
		// Tesla -> ["Model S 2019", "Model S 2018", "Model X 2016", "Model 3 2019"]
		// Ford -> ["F150 2017"]
		// Toyota -> ["Corolla 1997", "Celica 2002"]

		Map<String, List<Car>> groupedByBrand = cars.stream()
													.collect(Collectors.groupingBy(car -> car.getBrand()));

		System.out.println(groupedByBrand);
		
		Set<java.util.Map.Entry<String, List<Car>>> entrySet = groupedByBrand.entrySet();
		
		System.out.println(entrySet);
		
	}

	public static void example2() {
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
