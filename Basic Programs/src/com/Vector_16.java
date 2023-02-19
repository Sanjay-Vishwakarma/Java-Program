package com;

import java.util.*;

public class Vector_16 {
	public static void main(String[] args) {

		Vector vector = new Vector(3);
		System.out.println("Intial Capacity of Vector :" + vector.capacity());
		vector.addElement(new Integer(1));
		vector.addElement(new Integer(2));
		vector.addElement(new Integer(3));
		vector.addElement(new Float(2.342));
		vector.addElement(new Float(3.74));
		vector.addElement(new Double(45.82366));
		vector.addElement(new String("Hello"));
		System.out.println("Capacity (after adding elements): " + vector.capacity());
		System.out.println("Vector Size: " + vector.size());
		System.out.println("Vector FirstElement: " + vector.firstElement());
		System.out.println("Vector Last Element: " + vector.lastElement());

	}
}
