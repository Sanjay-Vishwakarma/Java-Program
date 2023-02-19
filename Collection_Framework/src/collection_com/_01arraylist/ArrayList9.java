package collection_com._01arraylist;

// example of retainAll()m method

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("ravi");
        al.add("vikas");
        al.add("thapa");
        al.add("sunny");
        al.add("devendra");
        System.out.println("first array list :"+al);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("sanjay");
        list2.add("sahil");
        System.out.println("second array list:"+list2);

        al.retainAll(list2);
        System.out.println("retainAll method using :"+al);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
     }
}
