package com;

import java.util.*;

public class Program {
	public static void main(String[] args) {
		int n;
		int cn;
		int count;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			cn = i;
			count = 0;
			for (int j = 1; j <= cn; j++) {
				if (cn % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println(cn);
		}

	}

}
