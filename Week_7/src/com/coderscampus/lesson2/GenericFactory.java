package com.coderscampus.lesson2;

public abstract class GenericFactory {
	
	private Integer totalCapacity;
	
	public abstract void build (Part[] parts);
	
	public Integer getTotalCapacity () {
		return totalCapacity;
	}
}
