package com.interview;

public class Quiz {
	public Quiz() {
		System.out.println("A");
	}

	static {
		System.out.println("B");
	}

//	why use empty block - 

	{
		System.out.println("C");
	}

	public static void main(String[] args) {

		Quiz q = new Quiz();
	}

}
