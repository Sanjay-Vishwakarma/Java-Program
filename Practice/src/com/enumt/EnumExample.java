package com.enumt;

// except inside class

/*
enum Color{
	RED,GREEN,BLUE;
}

public class EnumExample{
	
	public static void main(String[] args) {
		
		Color c1 =Color.RED;
		System.out.println(c1);
		
	}
	
}

*/

// we can use enum in class

public class EnumExample {

	enum Color {
		RED, GREEN, YELLOW;
	}
	
	
	public static void main(String[] args) {
		
		Color c1 = Color.GREEN;
		System.out.println(c1);
		
		
	}
}
