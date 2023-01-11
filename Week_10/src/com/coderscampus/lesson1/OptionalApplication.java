package com.coderscampus.lesson1;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalApplication {

	public static void main(String[] args) {

		// lesson 1
		Optional<String> fullName = Optional.of("Trevor Page");
		System.out.println(fullName);
		String trevor = fullName.get();
		System.out.println(trevor);
		
		// lesson 2
		Recipe cookies = new Recipe();
		cookies.setName("Chocolate Chip Cookies");
		cookies.setInstructions("1. Pre-heat oven\n2. Put dough on baking sheet\n3. Cook dough for 15 mins");
		cookies.setPriceOpt(new BigDecimal(9.99));
		System.out.println(cookies);
		
		// lesson 4
		cookies.getPriceOpt()
			   .ifPresent(RecipeService :: billClient);
	}

}
