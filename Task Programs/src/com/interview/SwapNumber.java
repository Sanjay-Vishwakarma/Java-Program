package com.interview;

public class SwapNumber {

	public void usingThirdVariable() {
		int x = 11;
		int y = 23;
		int temp = 0;

		temp=x;
		x=y;
		y=temp;
		System.out.println("using third variable:");
		System.out.println("Before swap : x =11  and y =23" + "\nAfter swap : x is =" + x + " and y is =" + y+"\n");

	

	}

	public void withoutUsingThirdVariable() {
		int x = 5;
		int y = 10;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Without using third variable: \t");
		System.out.println("Before swap : x =5  and y =10" + "\nAfter swap : x is =" + x + " and y is =" + y);

	}

	public static void main(String[] args) {
		SwapNumber swap = new SwapNumber();
		swap.usingThirdVariable();
		swap.withoutUsingThirdVariable();

	}

}
