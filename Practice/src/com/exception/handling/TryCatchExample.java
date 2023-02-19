package com.exception.handling;

public class TryCatchExample {

	static int a=30;
	 static int b=0;
	
	
	
	public static void main(String[] args) {
		
		
//		int a = 8;
//		int b=2;
		try {
			
			int c=a/b;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println("its fault "+e);
		}
		
		
		System.out.println("Rest of code");
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
