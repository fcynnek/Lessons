package com.coderscampus.lesson2;

public class Body implements Part {

	public Body () {
		System.out.println("A car body is being constructed");
	}
	@Override
	public Integer getSize() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public Integer getBuildTime() {
		// TODO Auto-generated method stub
		return 5;
	}

}
