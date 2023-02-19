package com.flair;

class B extends A {
	public B() {
		System.out.println("B");
	}

}

public class A {

	public A() {
		System.out.println("A");
	}

	public static void main(String[] args) {

		A a = new A();
	}

}
