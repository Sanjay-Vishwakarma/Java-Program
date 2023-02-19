package com.interview;

/*
 * Recursion in java is a process in which a method calls itself continuously. 
 * A method in java that calls itself is called recursive method.
 */

public class RecursiveFunction {

	static int count = 0;

	static void p() {
		count++;
		if (count <= 5) {
			System.out.println("Hello " + count);
			p();

		}
	}

	public static void main(String[] args) {

		RecursiveFunction.p();

	}

}
