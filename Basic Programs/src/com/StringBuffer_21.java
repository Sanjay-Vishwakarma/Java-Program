package com;

import java.io.*;

public class StringBuffer_21 {

	public static void main(String[] args) {

		StringBuffer st = new StringBuffer("HelpDesk");
		System.out.println(st);
		st.append("Developer");
		System.out.println(st);
		st.append(1);
		System.out.println(st);
		st.deleteCharAt(5);
		System.out.println(st);
		st.reverse();
		System.out.println(st);

	}
}
