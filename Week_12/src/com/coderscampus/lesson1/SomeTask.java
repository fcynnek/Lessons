package com.coderscampus.lesson1;

import java.util.Random;
import java.util.concurrent.Callable;

//public class SomeTask implements Runnable, Callable<TaskDto>
public class SomeTask implements Callable<TaskDto> {
	// runnable does not return anything because their base config is set to void
	// we could make use of callable instead if we need to make an operation that requires a return
	// Dto stands for Data, Transfer, Object which sole purpose is to transfer data
	
	private String name;
	private static int taskID=0;
	private TaskDto taskDto;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public void run() {
//		for (int i=0; i<10000000; i++) {
//			Integer int1 = new Random().nextInt();
//			Integer int2 = new Random().nextInt();
//			Double something = (int1+int2) * 1.5;
//		}
//		taskID++;
//		System.out.println("I'm task ID: " + taskID + " I'm running on thread: " + Thread.currentThread().getName());	
//	}
	
	
//	public TaskDto call() throws Exception {
//	public TaskDto call() {
	public SomeTask doSomeWork() {
		taskDto = new TaskDto();
		for (int i=0; i<10000000; i++) {
			Integer int1 = new Random().nextInt();
			Integer int2 = new Random().nextInt();
			Double something = (int1+int2) * 1.5;
			taskDto.setValue(something);
		}
		taskID++;
		System.out.println("I'm task ID: " + taskID + " I'm running on thread: " + Thread.currentThread().getName());
		return this;
	}
	
	public TaskDto markComplete () {
		taskDto.setFinished(true);
		return taskDto;
		
	}
}
