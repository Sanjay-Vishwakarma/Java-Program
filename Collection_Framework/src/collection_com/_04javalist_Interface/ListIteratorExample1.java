package collection_com._04javalist_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {
    public static void main(String args[]) {
        List<String> al = new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1, "Sachin");
//        iterating by list iterator
            ListIterator<String> li = al.listIterator();

            while(li.hasNext()) // forward
                    System.out.println("index: "+li.nextIndex()+" value: "+li.next());

            while(li.hasPrevious()) // backward
                    System.out.println("index: "+li.previousIndex()+" value: "+li.previous());

    }
} 