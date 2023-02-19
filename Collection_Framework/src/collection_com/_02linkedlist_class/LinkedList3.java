package collection_com._02linkedlist_class;

// example removing elements

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ajay");
        ll.add("Vijay");
        ll.add("Ramu");
        ll.add("Shamu");
        ll.add("Anuj");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Virat");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Amit");
        ll.add(1, "Sanjay"); // adding element at index position
        System.out.println("initial list of element :" + ll);
//        specific element remove
        ll.remove("Amit");
        System.out.println("After invoking remove object method:" + ll);
        ll.remove(3);
        System.out.println("After invoking remove index method:" + ll);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("hello");
        ll2.add("world");
        ll.addAll(ll2);
        System.out.println("updated list :" + ll);
//        removing all the elemnt from arraylist
        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method: " + ll);

        ll.removeFirst();
        System.out.println("after invoking removeFist() method :" + ll);
        ll.removeLast();
        System.out.println("after invoking removeLast() method :" + ll);
//removing first occurance from the list

        ll.removeFirstOccurrence("Gaurav");
        System.out.println("After invoking removeFirstOccurrence() method: " + ll);
        ll.removeLastOccurrence("Harsh");
        System.out.println("After invoking removeLastOccurrence() method: " + ll);

//        removing all the alemnt from the list
        ll.clear();
        System.out.println("All clear:" + ll);
    }
}
