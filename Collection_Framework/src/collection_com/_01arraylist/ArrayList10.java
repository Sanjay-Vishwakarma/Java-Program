package collection_com._01arraylist;
//example of isEmpty()

import java.util.ArrayList;


public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Is array list empty: "+al.isEmpty());
        al.add("sanjay");
        al.add("deepak");
        al.add("rahul");
        al.add("suraj");
        System.out.println("After added the element ");
        System.out.println("Is array list empty check:"+al.isEmpty());
    }
}
