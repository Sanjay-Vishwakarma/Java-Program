package com;

import java.util.*;

public class Switch_strng_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Country name ");
		String temp = sc.nextLine();
		String country = temp.toLowerCase();
		switch (country) {
		case "india":
			System.out.println("india country code : +91");
			break;
		case "usa":
			System.out.println("usa country code : +1");
			break;
		case "italy":
			System.out.println("italy country code : +39");
			break;
		case "spain":
			System.out.println("spain country code : +34");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
