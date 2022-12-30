package com.coderscampus.week9;

import java.util.Objects;

public class Car {

	private String brand;
	private String model;
	private Integer year;
	
	
	public Car (String brand, String model, Integer year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public Integer getYear() {
		return year;
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, model, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(model, other.model)
				&& Objects.equals(year, other.year);
	}
	
	
	
}
