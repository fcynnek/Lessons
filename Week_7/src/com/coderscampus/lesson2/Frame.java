package com.coderscampus.lesson2;

public class Frame implements Part {

	public Frame () {
		System.out.println("A car frame is being constructed");
	}
	
	@Override
	public Integer getSize() {
		return 10;
	}

	@Override
	public Integer getBuildTime() {
		return 10;
	}

}
