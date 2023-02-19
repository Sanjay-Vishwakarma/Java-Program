package com.methods;



class Student{
	
	String name ;
	int rollno;
	String city;
	
	
//	without toString()
	
	/*
	 * @Override public String toString() { return "Student [name=" + name +
	 * ", rollno=" + rollno + ", city=" + city + "]"; }
	 */
	
	
	public Student(String name, int rollno, String city) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.city = city;
	}
	
}



public class ToStringDemo {
	public static void main(String[] args) {
		
	Student st = new Student("Sanjay",12,"Mumbai");
	Student st2 = new Student("Raj",123,"Saga");
	System.out.println(st);
	System.out.println(st2);

	

}
}
