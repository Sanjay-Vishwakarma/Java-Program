package com.classs;



// Driver

public class ImmutableDemo {
	public static void main(String[] args) {

		
		Employee emp = new Employee("Abc123");
		String s1 = emp.getPancardNumber();
		System.out.println(s1);
	}
}
