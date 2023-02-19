package com;

import java.util.*;


public class Factorial_number {
public static void main(String[] args) {
	
	System.out.println("Enter the number :");
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	if (num==1) {
		int fact=0;

		int os=(num-1)*num;
		System.out.println(os);
	}
	
	
}
}
