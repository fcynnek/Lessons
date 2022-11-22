package com.coderscampus.lesson2;

public class Electronics implements Part {

	public Electronics () {
		System.out.println("A car electronic is being constructed");
	}
	
	@Override
	public Integer getSize() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public Integer getBuildTime() {
		// TODO Auto-generated method stub
		return 30;
	}

}
