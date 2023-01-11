package com.coderscampus.lesson5;

public enum Status {
// changing the word class for enum
	
	ACTIVE("A"),
	INACTIVE("I"),
	DELETED("D");
	// all caps is notation for constant
	
	private String value;
	
	private Status (String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
