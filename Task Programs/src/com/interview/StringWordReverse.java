package com.interview;

import java.util.Scanner;

public class StringWordReverse {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println("The original string is: " + str);
			String[] temp = str.split(" ");
			String rev = "";
			for (int i = 0; i < temp.length; i++) {
				if (i == temp.length - 1)
					rev = temp[i] + rev;
				else
					rev = " " + temp[i] + rev;
			}
			System.out.println("The reversed string is: " + rev);
		}
	}
}
