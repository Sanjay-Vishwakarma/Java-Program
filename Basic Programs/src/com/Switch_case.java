package com;

import java.util.*;

public class Switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number of 1 to 5");
		int n = sc.nextInt();
		switch (n) {
		case 1: {

			System.out.println("you Enter One");
			break;
		}

		case 2: {
			System.out.println("you Enter Two");
			break;
		}
		case 3: {
			System.out.println("you Enter Three");
			break;
		}
		case 4: {
			System.out.println("you Enter Four");
			break;
		}
		case 5: {
			System.out.println("you Enter Five");
			break;
		}

		default:
			System.out.println("Enter correct number");
		}
	}
}
