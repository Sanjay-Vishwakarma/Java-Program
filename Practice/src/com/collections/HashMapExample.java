package com.collections;
import java.util.HashMap;

/**
 * @author Sanjay
 *
 */
public class HashMapExample {

	public static void main(String[] args)
	{

		// This is how to declare HashMap
		HashMap<Integer, Object> hm = new HashMap<Integer, Object>();

		
		
		
		// Adding elements to HashMap*/
		hm.put(12, "geeks");
		hm.put(2, "practice");
		hm.put(7, "contribute");

		System.out.println("\nHashMap object output :\n\n" + hm);

		// store data with duplicate key
		hm.put(12, "geeks");

		System.out.println("\nAfter inserting duplicatessss key :\n\n" + hm);
	}
}
