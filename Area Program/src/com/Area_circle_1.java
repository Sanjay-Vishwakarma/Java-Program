package com;

import java.util.*;

public class Area_circle_1 {
	public static void main(String[] args) {

		System.out.println("Enter the radius: ");

		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		r = (22 * r * r) / 7;
		System.out.println("The are of " + r + "is: " + r);
	}
}
