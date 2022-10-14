package com.coderscampus.objects;

public class Human {
	
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// (visibility modifier) : return type : method name : parameters : scope
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + ", Weight: " + weight + ", Eye color: " +
				eyeColor;
	}
	
	// defining inputs inside a method (String , String b, String c, String d, int e)
	void setProperties (String gender, String height, String weight, String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		
	}
}
