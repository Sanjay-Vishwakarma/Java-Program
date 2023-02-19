package com;

import java.util.*;

public class Do_while_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("You are inside loop");
			System.out.println("ENter 1 to exit");
			i = sc.nextInt();
		} while (i != 1);

		System.out.println("You are out of loop");

	}
}
