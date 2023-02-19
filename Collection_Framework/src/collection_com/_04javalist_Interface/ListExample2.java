package collection_com._04javalist_Interface;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String args[]) {
        //Creating a List
        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

//        accessing the elmemnt
        System.out.println("Accessing index point value:" + list.get(2));

//     change the elment
        list.set(2, "jira");

//     iterating the list using for each loop
        for (String str : list)
            System.out.println(str);

    }
}  