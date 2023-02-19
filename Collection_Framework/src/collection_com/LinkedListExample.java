package collection_com;


/* Java LikedList class use doubly linked list to store the elements
 * It provides a linked-list data structure 
 */


import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Red");
		ll.add("Blue");
		ll.add("Green");
		ll.add("Black");
		System.out.println("Elemnts of Linked List: "+ll);
		
		//Acess element by object
		Object myColor=ll.get(0);
		System.out.println("Color at [0] position is: "+myColor);
		//this is the first position
		ll.addFirst("White");
		//this is the last position
		ll.addLast("Orange");

		System.out.println(ll);
		System.out.println("Remove element first and last position: ");
		
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
	}
}
