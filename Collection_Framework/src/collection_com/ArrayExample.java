package collection_com;

import java.util.ArrayList;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> array = new ArrayList<String>() ;
		array.add("C");
		array.add("Java");
		array.add("Python");
		array.add("Javascript");
		System.out.println("ArrayList: ");
		System.out.println(array);
		array.add(2, "Go");
		System.out.println(array);
		System.out.println("ArrayList size: "+array.size());
		array.remove(3);
		System.out.println("After remove ArrayList: ");

		System.out.println(array);
		
	}

}
