package com.coderscampus.security.Unit20Extra.domain;

import java.math.BigDecimal;

// Record is a new type of class introduced in Java 15 that implements the interface and mimics
// a class with a constructor and getters and setters based on the private values

public record Product(
		Integer id, 
		String name, 
		BigDecimal price) {

//public class Product {
//
//	private Integer id;
//	private String name;
//	private BigDecimal price;
//	
//	
//	public Product(Integer id, String name, BigDecimal price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//	}
//	
//	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
	
	
}
