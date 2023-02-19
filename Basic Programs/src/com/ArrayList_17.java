package com;

import java.util.*;

public class ArrayList_17 {
	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();

		arraylist.add("C");
		arraylist.add("C++");
		arraylist.add("Java");
		arraylist.add("j#");
		arraylist.add("Go");
		arraylist.add("python");
		arraylist.add("Javascript");
		System.out.println("\n ArrayList :");
		System.out.println(arraylist);
		arraylist.add(2, "Ruby");
		System.out.println("\n ArrayList After adding 2nd position:");
		System.out.println(arraylist);
		System.out.println("\n ArrayList Remove by  index or elemnt java and j# :");
		arraylist.remove(3);
		arraylist.remove("j#");
		
		System.out.println(arraylist);
		System.out.println(" \n");

		String str;
		Iterator e = arraylist.iterator();
		while (e.hasNext()) {
			str = (String) e.next();
			System.out.println(str);
		}

	}
}
