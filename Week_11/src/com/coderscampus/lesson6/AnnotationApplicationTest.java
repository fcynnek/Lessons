package com.coderscampus.lesson6;

public class AnnotationApplicationTest {
	
	@MyTest(enabled = false)
	// by default, we had set it to enabled=true
	public void test1() {
		if (true)
			throw new RuntimeException("This won't throw an exception as the test is disabled");
	}
	
	@MyTest("This is a value assigned to this particular use of this annotation")
	// only application when passing only one annotation
	public void test2() {
		if (true)
			throw new RuntimeException("This test failed!");
	}
	
	@MyTest(value = "This is a value", enabled = true)
	public void test3() {
		System.out.println("This test should pass");
	}

}
