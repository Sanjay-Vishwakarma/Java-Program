package com.collections;
// Java program to demonstrate working of HashSet

// Importing HashSet class from java.util package
import java.util.HashSet;

// Mai class
public class HashSetExample {

	// Main driver method
	public static void main(String[] args)
	{

		HashSet<String> hs = new HashSet<String>();
		// Adding elements to the HashSet
		hs.add("geeks");
		hs.add("practice");
		hs.add("contribute");
		;

		System.out.println(
			"Before adding duplicate values \n\n" + hs);

		// Addition of duplicate elements
		hs.add("geeks");
		hs.add(null);
		hs.add("practice");

		System.out.println(
			"\nAfter adding duplicate values \n\n" + hs);

		// Addition of null values
		hs.add(null);
		hs.add(null);

		// Displaying HashSet elements
		System.out.println("\nAfter adding null values \n\n"
						+ hs);
	}
}
