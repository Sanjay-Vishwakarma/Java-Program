package com;


// 2 X 2 Dimension

import java.io.DataInputStream;

public class Array_2_Dimension_15 {

	public static void main(String[] args) {

		DataInputStream input = new DataInputStream(System.in);
		int arr[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				try {

					arr[i][j] = Integer.parseInt(input.readLine());

				} catch (Exception e) {

				}
			}
		}
		System.out.println("Array is :\n");
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.println("Value at arr[" + i + "][" + j + "] is:" + arr[i][j]);
			}
		}

	}

}
