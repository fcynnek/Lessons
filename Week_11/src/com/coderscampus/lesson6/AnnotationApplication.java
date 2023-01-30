package com.coderscampus.lesson6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationApplication {

	public static void main(String[] args) {
		
//		AnnotationApplicationTest testClass = new AnnotationApplicationTest();
//		
////		MyTest[] annotations = testClass.getClass().getAnnotationsByType(MyTest.class);
//		
//		for (MyTest myTest : annotations) {
//			if (myTest.enabled()) {
//				System.out.println("This MyTest is enabled: " + myTest);
//			} else {
//				System.out.println("This MyTest is disabled: " + myTest);
//			}
//		}
		
		
		
//		Annotation[] annotations = testClass.getClass().getAnnotations();
//		
//		for (Annotation annotation : annotations) {
//			System.out.println(annotation);
//		}
	
		
		
		AnnotationApplicationTest testClass = new AnnotationApplicationTest();
		
//		Class<AnnotationApplicationTest> obj = AnnotationApplicationTest.class;
//		Method[] methods = obj.getMethods();
		// the above two lines can be simplified with:
		Method[] methods = AnnotationApplicationTest.class.getMethods();
		
		int testPass = 0;
		int testFail = 0;
		int testIgnore = 0;

		for (Method method : methods) {
			MyTest myTest = method.getAnnotation(MyTest.class);

			if (myTest != null) {
				try {
					if (myTest.enabled()) {
						method.invoke(testClass);
						testPass++;
					} else {
						testIgnore++;
					}
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					testFail++;
				}
			}
		}
		System.out.println("Passed: " + testPass + ", Failed: " + testFail + ", Ignored: " + testIgnore);
	
	}
}
