package collection_com._02linkedlist_class;

// linked list example add the element

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ajay");
        ll.add("Vijay");
        ll.add("Ramu");
        ll.add("Shamu");
        System.out.println("initial list of element :" + ll);
        //        adding element specific position
        ll.add(2, "Sanjay");
        System.out.println("after invoking elemnt " + ll);

        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("simaran");
        ll2.add("priyanka");
//        adding second list element to the first list

        ll.addAll(ll2);
        System.out.println("After invookin the list :" + ll);

        LinkedList<String> ll3 = new LinkedList<>();
        ll3.add("sham");
        ll3.add("vikas");
        //        adding second list element to the first list at specific position

        ll.addAll(1, ll3);
        System.out.println("after adding " + ll);

//        adding the element first position
        ll.addFirst("Sanjay");
        System.out.println(ll);
        ll.addLast("Vishwakarm");
        System.out.println(ll);
    }
}
