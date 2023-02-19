package collection_com;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {

		Vector vector = new Vector(3);
		vector.addElement("jarvis");
		vector.add("cool");
		System.out.println(vector);
		System.out.println("The capacity of vector: " + vector.capacity());
		System.out.println("the size of vector: " + vector.size());
		vector.addElement("C");
		vector.addElement(new Integer(2));
		vector.addElement(new String("Python"));
		vector.addElement("Mongo");
		System.out.println(vector);
		System.out.println("After remove : ");
		vector.remove("C");


		System.out.println(vector);
		System.out.println("the size of vector: " + vector.size());
	}

}
