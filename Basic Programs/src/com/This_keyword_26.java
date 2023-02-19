package com;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
	}
}

//main Driver
public class This_keyword_26 {
	public static void main(String[] args) {
		Student st = new Student(1203, "Harry");
		st.display();

	}
}
