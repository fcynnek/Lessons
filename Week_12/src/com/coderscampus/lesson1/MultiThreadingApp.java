package com.coderscampus.lesson1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// This is only helpful when the threads are going to be waiting for other services to complete
//		for (int i=0; i<50; i++) {
//			SomeTask task = new SomeTask();
//			new Thread(task).start();	
//		}
		
		// For CPU bound ops like in "SomeTask" class, we should make use of an ExecutorService
		ExecutorService service = Executors.newFixedThreadPool(3);
//		for (int i=0; i<50; i++) {
//			service.execute(new SomeTask());			
//		}
		
//		ExecutorService service = Executors.newCachedThreadPool();
//		ExecutorService service = Executors.newSingleThreadExecutor();
		for (int i=0; i<50; i++) {
//			service.execute(new SomeTask());
			// execute is from the runnable class 
			Future<TaskDto> futureTask = service.submit(new SomeTask());
			// submit is from the callable class
			System.out.println(futureTask.get());
			// the problem with .get() is that it makes the code not asynchronous because it has to wait for the operation to finish
			// before it can "get" the output of the calculation
		}
	}
}
