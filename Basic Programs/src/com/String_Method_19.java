package com;

public class String_Method_19 {
	public static void main(String[] args) {

		String website = "Programming Prashan.com";
		System.out.println("\nString: " + website);
		System.out.println("\nLength of String: " + website.length());
		System.out.println("\nUppercase of String: " + website.toUpperCase());
		System.out.println("\nLowercase of String: " + website.toLowerCase());
		System.out.println("\nCharecter at 4th index is: " + website.charAt(4));
		System.out.println("\nIndex of 'g is: " + website.indexOf('g'));

		System.out.println("\nIndex of 'g' after index 5 is: " + website.indexOf('g', 5));

		System.out.println("\nSubstring from 11th index is: " + website.substring(11));
		System.out.println("\nSubstring from 0 to 11th index is: " + website.substring(0, 11));
		System.out.println("\nString after replacing 'r' with 'x' is: " + website.replace('r', 'x'));
	}
}
