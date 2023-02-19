package collection_com._01arraylist;

// Java ArrayList example to add elements

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("cat");
        al.add("dog");
        al.add("lion");
        System.out.println(al);

        al.add(1,"deer");
        System.out.println("after added element"+al);

        ArrayList<String> al2= new ArrayList<>();
        al2.add("beer");
        al.addAll(al2);
        System.out.println("secnd array"+al);

        ArrayList<String> al3 = new ArrayList<>();
        al3.add("cheeta");
        al3.add("tiger");

        al.addAll(al3);
        System.out.println("third array"+al);
    }
}
