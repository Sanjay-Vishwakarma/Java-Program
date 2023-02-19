package com.classs;

/*
 equal() method
 == operator
 comparisonTo() method*/
 





public class StringComparisonDemo {
public static void main(String[] args) {
	
	
	String s1 = "Sachin";
	String s2 = "SACHIN";
	String s3 = "Sachin";
	String s4 = new String("Java");
	String s5 = new String("SACHIN");

	
//	equals() method
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s5));
	System.out.println(s1.equals(s3));
	
//	equalIgnoreCase() method
	
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.equalsIgnoreCase(s4));
	System.out.println(s1.equalsIgnoreCase(s3));
	

// ==  operator
	
}
	
	
}
