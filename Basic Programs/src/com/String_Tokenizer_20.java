package com;

import java.util.*;

public class String_Tokenizer_20 {

	static String str = "Hello_Java_Programming";

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(str,"_");

		while(st.hasMoreElements()) {
			
			String token = st.nextToken();
			System.out.println(token+"\n");
		}
		
	}
}
