package com.interview;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		System.err.println("Enter something ....");
		
		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.next();
				String nst="";
		char ch = 0;
		
		for(int i=0; i<str.length();i++)
		{
			ch=str.charAt(i);
			nst=ch+nst;
			
		}
		System.out.println("Reversed element : "+nst);
	}

}
