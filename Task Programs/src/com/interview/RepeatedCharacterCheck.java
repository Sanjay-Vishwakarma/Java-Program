package com.interview;

import java.util.HashMap;

public class RepeatedCharacterCheck {

	public static void main(String[] args) {

		String str = "Java is first programming language and python is also";
		char arr[] = str.toCharArray();
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (hash.containsKey(c)) {
				hash.put(c, hash.get(c) + 1);
			} else
				hash.put(c, 1);
		}
		System.out.println(hash);
	}
}
