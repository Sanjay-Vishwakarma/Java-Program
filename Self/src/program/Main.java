package program;

import java.util.Scanner;

public class Main {

	public static String doubleChar(String str) {

		String result = "";

		for (int i = 0; i <= str.length() - 1; i++) {

			result += str.charAt(i);

			result += str.charAt(i);

		}

		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String insptr=sc.nextLine();
		String output=doubleChar(insptr);
		System.out.println(output);
		
		
	}
}
