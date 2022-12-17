package com.coderscampus.week9;

public class ListApplication {

	public static void main(String[] args) {

		String[] names = new String[4];
		// a limitation to using Arrays is that it always need the size of the array

//		names[1] = "Trevor Page";
//		names[2] = "";
//		names[3] = "";
//		names[4] = "";
		// this will give an out of bound error because Java is a 0 base index
		// so the first index for [4] is i=0 and the highest is i=3
		
		names[0] = "Trevor Page";
		names[1] = "Jane Doe";
		names[2] = "John Doe";
		names[3] = "Elon Musk";
		
		
	}

}
