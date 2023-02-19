package com;

 class Test1 {
	public  void print() {
		
	}

	public void println(int a) {
		System.out.println(a);
	}

	public void println(int a, int b) {
		System.out.println(a + b);
	}
}

public class TestRun {

	
	public TestRun() {
		System.out.println("constructor call");
	}
	public static void main(String[] args) {
		Test1 dd = new Test1();
		
	}
}
