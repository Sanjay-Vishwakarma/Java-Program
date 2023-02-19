package collection_com._01arraylist;

//Iterating elements using for each loop

import java.util.ArrayList;


public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Chiku");
        list.add("Deepak");
        list.add("Sonu");
        list.add("Sanjay");

//        traversing by for each loop
        for(String obj:list)
        {
            System.out.println("by for each loop:\t"+obj);
        }
    }
}
