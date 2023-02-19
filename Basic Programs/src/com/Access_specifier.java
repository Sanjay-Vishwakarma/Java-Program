package com;

public class Access_specifier {

	int a = 10;
	private int b = 30;
	public int c = 40;

	void meth1() {
		System.out.println("Public method ");
	}

	private void meth2() {
		System.out.println("Private method");
	}

	public static void main(String[] args) {
		Access_specifier obj = new Access_specifier();
		obj.meth2();
	}

}
