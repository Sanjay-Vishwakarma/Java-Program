package collection_com._03arraylist_and_linkedlist;

//Example of arraylist and linked list

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // creating array list
        list.add("cat");
        list.add("dog");
        list.add("cow");

        List<String> ll = new LinkedList<>(); // crreating linkedlist
        ll.add("lion");
        ll.add("tiger");
        ll.add("cheeta");

        System.out.println("Arraylist elmemt "+list);
        System.out.println("LinkedList elmemt "+ll);
    }
}
