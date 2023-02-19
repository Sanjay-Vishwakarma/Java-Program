package com;

class SuperClass {
	public SuperClass() {
		System.out.println("Super class Constructor");
	}

}

class SubClass extends SuperClass {

	SubClass() {
		super();
		System.out.println("Sub class Constructor called");
	}

	void msg() {
		System.out.println("Hello Wolrd");
	}
}

// main driver
public class Super_keyword_24 {
public static void main(String[] args) {
	SubClass obj =new SubClass() ;
	
	obj.msg();
}
}
