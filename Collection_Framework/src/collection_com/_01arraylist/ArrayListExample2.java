package collection_com._01arraylist;

// Iterating ArrayList using iterator

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Sanjay");
        al.add("Rahul");
        al.add("Rajesh");
        al.add("Deepak");
        al.add("Sonu");
        al.add("Sanjay");

//        Using iterator to traverse the element
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println("Elements :\t" + itr.next());
        }

    }
}

