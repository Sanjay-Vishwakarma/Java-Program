package collection_com._01arraylist;
//How to array list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("jaguar");
        list1.add("tiger");
        list1.add("lion");
        list1.add("cheetah");
        list1.add("dear");
        list1.add("dog");
//        sorting the list
        Collections.sort(list1);
        for (String animal : list1) {
            System.out.println(animal);
        }
        System.out.println("Second sorting..........");
//        creating a list of number
        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(11);
        list2.add(105);
        list2.add(99);
        list2.add(1);
        Collections.sort(list2);
        for(Integer num:list2)
        {
            System.out.println(num);
        }
    }

}
