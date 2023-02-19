package program;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {

		int st;
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number--");
			st = sc.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(st + "x" + i + "=" + st * i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
