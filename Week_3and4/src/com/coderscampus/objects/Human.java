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
	void setProperties (String _gender, String _height, String _weight, String _eyeColor) {
		gender = _gender;
		height = _height;
		weight = _weight;
		eyeColor = _eyeColor;
		
	}
}
