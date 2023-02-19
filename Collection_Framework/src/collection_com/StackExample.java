package collection_com;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<String>();

		// Add elements to Stack == push
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");

		System.out.println("PUSH -Stack: " + animals);

		// Remove element stacks == pop
		String element = animals.pop();
		System.out.println("POP - Removed Element: " + element);
		System.out.println("\nAfter Removed element: " + animals);

		// Access element from the top == peek
		String elements = animals.peek();
		System.out.println("\nPEEK - Element at top: " + elements);

		// Search an element
		int position = animals.search("Cat");
		System.out.println("\nSEARCH - Position of Horse: " + position);

		// Check if stack is empty
		boolean result = animals.empty();
		System.out.println("\nEMPTYcHEK - Is the stack empty? " + result);

	}
}