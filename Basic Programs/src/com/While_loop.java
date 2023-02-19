package com;

import java.util.*;

public class While_loop {
	public static void main(String[] args) {
		int i = 0;

		Scanner sc = new Scanner(System.in);
		while (i != 4) {
			System.out.println("You are inside while loop ");
			System.out.println("press 4 to exit ");
			i=sc.nextInt();
		}
		System.out.println("You are out of while loop");

	}
}
