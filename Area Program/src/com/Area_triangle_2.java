package com;

import java.util.*;

class Triangle {

	double height;
	double width;

	void Traingle() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height: ");
		height = sc.nextDouble();
		System.out.println("Enter the width: ");
		width = sc.nextDouble();
		double a = (height * width) / 2;
		System.out.println("This is the area of triangle: " + a);

	}
}

// driver
public class Area_triangle_2 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.Traingle();
	}
}
