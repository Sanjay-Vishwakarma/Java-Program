package com.interview;

public class StringExample {
	public static void main(String[] args) {
		String s1 = new String("Apple");
		String s2 ="Apple";
		String s3 ="Hello";
		String s4 ="Apple";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		
		
		
	}

}
