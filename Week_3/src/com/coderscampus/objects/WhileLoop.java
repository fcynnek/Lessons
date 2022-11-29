package com.coderscampus.objects;

import java.util.Date;

public class WhileLoop {

	public static void main(String[] args) {
		
//		int i = 0;
//		while (i < 10) {
//			System.out.println(i);
//			i = i + 1;
//		}

		Date now = new Date();
		//YYYY (YYYY minus 1900), MM, DD, HH, mm, ss
		Date stopNow = new Date(122, 9, 15, 18, 7, 0);
		int i = 0;
		while (now.before(stopNow)) {
			i = i +1;
			System.out.println(i + ": " + now);
			now = new Date();
		}
		
		System.out.println("Done");
	}

}
