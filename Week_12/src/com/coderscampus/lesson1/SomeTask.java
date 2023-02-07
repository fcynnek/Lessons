package com.coderscampus.lesson1;

public class SomeTask implements Runnable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("I'm running on thread: " + Thread.currentThread().getName());
		
	}
}
