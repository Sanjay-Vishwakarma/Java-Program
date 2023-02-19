package com;

import java.util.*;

public class CountryCode {

	public static void main(String[] args) {

		String s1 = "+91-9076544553";
		StringTokenizer st = new StringTokenizer("+91-9076544553","-");
		String sd ="";
		while(st.hasMoreTokens())
		{
			 sd = (String) st.nextToken();
			 
			
		}
		
		System.out.println("--------------------------------------------------------------");
		System.out.println(s1.contains("-"));

		String a = s1.split("-")[0];
		
		System.out.println(a);

		List<String> list = new ArrayList<>();
		list.add("+91-9076544553");
		list.add("+1-365 544 9553");
		list.add("022-7654 4553");
		list.add("+365-907 654 4553");

		for (Object string : list) {
			
			System.out.println(string);
		}
	}

}
