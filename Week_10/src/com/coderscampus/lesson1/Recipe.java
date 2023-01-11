package com.coderscampus.lesson1;

import java.math.BigDecimal;
import java.util.Optional;

public class Recipe {

	private String name;
	private String instructions;
	private Optional<BigDecimal> priceOpt = Optional.empty(); 	// Big Decimal is suggested to use for monetary values
																// Optional.empty() will take care of null pointer exceptions
	
	
	@Override
	public String toString() {
		return "Recipe [name=" + name + ", instructions=" + instructions + getPrice() + "]";
	}
	
	
	private String getPrice() {
		String priceString = priceOpt.map(price -> ", price=" + price)
									 .orElse(", price=free");
		return priceString;
	}


	public String getName() {
		return name;
	}
	public String getInstructions() {
		return instructions;
	}
	public Optional<BigDecimal> getPriceOpt() {
		return priceOpt;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
//	public void setPriceOpt(Optional<BigDecimal> priceOpt) { // get rid of the wrapper because setting shouldn't be optional
	public void setPriceOpt(BigDecimal price) {
		this.priceOpt = Optional.ofNullable(price);
	}
	
	
	
}
