package com;

// array insert as list without ordered  

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_14 {
	public static void main(String[] args) {

		int arr[];
		arr = new int[5];

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			for (int i = 0; i < 5; i++) {

				int j = i + 1;
				System.out.println("Enter Element No." + j);
				String s = br.readLine();
				arr[i] = Integer.parseInt(s);
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("arr[" + i + "]=" + arr[i]);
			}

		} catch (Exception e) {
			System.out.println("" + e);
		}

	}

}
