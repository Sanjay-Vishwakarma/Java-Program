package com;

import java.util.*;

public class Prime_Nbr_List {
	public static void main(String[] args) {

		int n, i;
		int num = 1;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (count < n) {
			num = num + 1;
			for (i = 2; i <= num; i++) {
				if (num % i == 0)
					break;
			}
			if (i == num)
				count = count + 1;
		}
		System.out.println(num);

	}

}
