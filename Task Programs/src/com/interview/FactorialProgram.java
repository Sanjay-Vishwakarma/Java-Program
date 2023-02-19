package com.interview;

public class FactorialProgram {

	static int usingRecursionMethod(int n) {

		if (n == 0)
			return 1;
		else
			return (n * usingRecursionMethod(n - 1));
	}

	public void withoutRecursion() {
		int fact = 1, inp = 5;
		for (int i = 1; i <= inp; i++) {
			fact = fact * i;
		}
		System.out.println("factorial number " + fact);
	}

	public static void main(String[] args) {
		int factt = 1;
		int input = 6;
		FactorialProgram fp = new FactorialProgram();
		fp.withoutRecursion();
		factt = usingRecursionMethod(input);
		System.out.println("factorial using recursion method: " + factt);

	}

}
