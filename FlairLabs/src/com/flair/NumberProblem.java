package com.flair;

import java.util.Scanner;

public class NumberProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 4 digit number:");
		int number = sc.nextInt();
		int max =number;
		int reversed = 0;

		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}

		System.out.println(max-reversed);
		
	}

}
