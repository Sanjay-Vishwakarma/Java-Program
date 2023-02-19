package collection_com._02linkedlist_class;

//reverse a list of elements

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Sanjay");
        ll.add("Ajay");
        ll.add("jay");
        Iterator i = ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
