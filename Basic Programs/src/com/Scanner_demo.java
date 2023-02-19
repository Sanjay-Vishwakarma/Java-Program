package com;

import java.util.*;

public class Scanner_demo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = s.nextLine();
		System.out.println("Enter sem : ");
		int sem = s.nextInt();
		System.out.println("Enter CGPA : ");
		float cgpa = s.nextFloat();
		System.out.println("\nDetails :");
		System.out.println("Name " + name);
		System.out.println("Sem " + sem);
		System.out.println("CGPA " + cgpa);

	}

}
