package com.string.classexample;

public class SplitExample {

	public SplitExample() {

		String name = "sanjay,allu,picka";
		String[] arr = name.split(",");

		for (String w : arr) {
			System.out.println(w);
		}

	}

	public static void main(String[] args) {

		new SplitExample();

	}

}
