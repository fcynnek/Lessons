package com.coderscampus.lesson1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class MultiThreadingApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// This is only helpful when the threads are going to be waiting for other services to complete
//		for (int i=0; i<50; i++) {
//			SomeTask task = new SomeTask();
//			new Thread(task).start();	
//		}
		
		// For CPU bound ops like in "SomeTask" class, we should make use of an ExecutorService
//		ExecutorService service = Executors.newFixedThreadPool(3);
//		for (int i=0; i<50; i++) {
//			service.execute(new SomeTask());			
//		}
		
//		ExecutorService service = Executors.newCachedThreadPool();
//		ExecutorService executor = Executors.newSingleThreadExecutor();
		
//		ExecutorService cpuBoundTask = Executors.newSingleThreadExecutor();
		ExecutorService cpuBoundTask = Executors.newFixedThreadPool(3);
		ExecutorService ioBoundTask = Executors.newCachedThreadPool();
		for (int i=0; i<20; i++) {
//			service.execute(new SomeTask());
			// execute is from the runnable class 
			// submit is from the callable class
//			Future<TaskDto> futureTask = service.submit(new SomeTask());
//			System.out.println(futureTask.get());
			// the problem with .get() is that it makes the code not asynchronous because it has to wait for the operation to finish
			// before it can "get" the output of the calculation
			
//			CompletableFuture.supplyAsync(() -> new SomeTask(), executor)
			CompletableFuture.supplyAsync(() -> new SomeTask(), ioBoundTask)
							 .thenApplyAsync(task -> task.doSomeWork(), cpuBoundTask)
							 .thenApplyAsync(someTask -> someTask.markComplete(), ioBoundTask)
							 .thenAcceptAsync(dto -> System.out.println(dto), ioBoundTask);
			
		}
		
		// If no ExecutorService is provided, the program assumes it runs on the main thread and will prematurely end the process
		// There is an alternate thread called the ForkJoinPool which is the default thread for CompletableFutures 
		
//		ForkJoinPool commonPool = ForkJoinPool.commonPool();
	}
}
