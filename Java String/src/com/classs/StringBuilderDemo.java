package com.classs;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello ");
		builder.append("Java");
		builder.append('a');
		System.out.println(builder);
	}
}
