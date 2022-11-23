package com.coderscampus.lesson5;

public class Person implements Comparable <Person> {
	// need to identify the type by using the < > comparing one person object to another person object

	private String name;
	private Integer height;
	
	
	public Person (String name, Integer height)	{
		this.name = name;
		this.height = height;
	}
	
	
	public String getName() {
		return name;
	}
	public Integer getHeight() {
		return height;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}


	@Override
	public int compareTo(Person that) {
		
		// this way to sort requires more code
		
//		if (this.height > that.height) {
//			return -1;
//		} // else if (this.height.equals(that.height)) {
//		  //	return 0;
//		
//		// in case we need to sort when the values are equal, we implement compareTo because String has a native compare method
//		// integers also implements compareTo method so we can leverage the .compareTo with the height as well
//		else if (this.height.equals(that.height)) {
//			return this.name.compareTo(that.name);
//		} else {
//			return 1;
//		}
		
		
		// this way of sorting requires less coding and leverages the innate code of compareTo
		
		if (this.height.compareTo(that.height) == 0) {
			return this.name.compareTo(that.name); // this will sort the names in asc order
		} else {
			return that.height.compareTo(this.height); // this will sort the height in desc order
		}
		
	}
	
	
	
}
