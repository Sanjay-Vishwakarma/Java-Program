package com;

import java.util.*;

public class Even_or_odd {
	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even number is "+num);
		} else
			System.out.println("Odd number is "+num);

	}
}
