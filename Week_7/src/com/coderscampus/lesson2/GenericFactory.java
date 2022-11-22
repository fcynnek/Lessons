package com.coderscampus.lesson2;

public abstract class GenericFactory {
	
	protected Integer totalCapacity;
	// protected can be accessed from classes that inherit 
	
	public abstract Product build (Part[] parts);
	
	public Integer getTotalCapacity () {
		return totalCapacity;
	}
}
