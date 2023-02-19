package com;

class Main_One {

	static int i = 1;
	int j = 1;

	void method() {

		System.out.println("Value of i=" + i + "&j=" + j);
		i++;

	}

}

public class Static_Variable_22 {
	public static void main(String[] args) {
		Main_One m1 = new Main_One();
		Main_One m2 = new Main_One();
		Main_One m3 = new Main_One();
		m1.method();
		m2.method();
		m3.method();
	}

}
