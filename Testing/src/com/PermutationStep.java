package com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class PermutationStep {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer number");
		int n = Integer.parseInt(bf.readLine());
		PermutationStep.big(n);
	}

	static void big(int a) {
		String n = a + "";
		char c[] = n.toCharArray();
		for (int i = c.length - 1; i >= 1; i--) {

			if (c[i - 1] > c[i]) {
				continue;
			} else {
				// swap an integer
				int index =  PermutationStep.check(c, c[i - 1]);
				char temp = c[i - 1];
				c[i - 1] = c[index];
				c[index] = temp;

				Arrays.sort(c, i, c.length);
				break;
			}

		}
		 PermutationStep.print(c);
	}

	static void print(char c[]) {

		for (int k = 0; k < c.length; k++) {
			System.out.print(c[k]);
		}
	}

	static int check(char a[], int j) {
		int s;
		for (s = a.length - 1; s >= 0; s--) {
			if (a[s] > j)
				break;
		}
		return s;
	}

}
