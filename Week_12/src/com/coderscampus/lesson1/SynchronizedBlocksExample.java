package com.coderscampus.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

public class SynchronizedBlocksExample {

	private AtomicInteger j = new AtomicInteger(0);
	// a solution is to change the thread for a "thread safe"
	// for integers, the thread safe is an "atomic integer" but it needs to be instanciated and passed in the initial value 
	
	@Test
	public void asynchronous () {
		
		List<CompletableFuture<Integer>> tasks = new ArrayList<>();
		
		for (int i=0; i<10000; i++) {
			// problem with this code is that it occupies the main thread and the system terminates it prematurely
			CompletableFuture<Integer> task = CompletableFuture.supplyAsync(() -> incrementJ());
//			incrementJ();
			tasks.add(task);
		}
		// as a solution, we can create an empty list (line16) 
		// create a while loop and have it count the completed lines as a way to force the code to keep running until the conditions to leave the while loop are met
		
		while (tasks.stream().filter(CompletableFuture :: isDone).count() < 10000) {
			System.out.println("Number of completed threads: " + tasks.stream().filter(CompletableFuture :: isDone).count());
		}
		outputJ();
	}

	private void outputJ() {
		System.out.println(j);
	}

	private Integer incrementJ() {
//		return j++;
		// because atomic integer is not a defined value but a function, it cannot resolve to the ++ incrementing
		return j.incrementAndGet();
	}
}
