package com.interview;

public class ReverseCharacter {

	public static void main(String[] args) {
		String originalStr = "Hello this is my name";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}
		System.out.println(reversedStr);
	}
	
}
