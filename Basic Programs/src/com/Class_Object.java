package com;

public class Class_Object {
	int var1 = 12;
	float var2 = 3.56f;

	void meth() {
		int meth1 = 10;
		float meth2 = 30;
		System.out.println("class var1 " + var1);
		System.out.println("class var2 " + var2);
		System.out.println("method meth1 " + meth1);
		System.out.println("method meth2 " + meth2);

	}

	public static void main(String[] args) {
		Class_Object ob = new Class_Object();
		ob.meth();
	}
}
