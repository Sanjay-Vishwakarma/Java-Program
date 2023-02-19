package collection_com._01arraylist;

//iterating Collection through remaining ways

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class ArrayList4 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("name list" + list);
//        here elememnt iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
//        traversing through while looop
        System.out.println("By while loop:");
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);
        }
//traversing through for loop
        System.out.println("By for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        Traversing elements using forEach() method and also here using lambda expression
        System.out.println("By forEach() method:");

        list.forEach(a -> {
            System.out.println(a);
        });
//Traversinh through forEachRemaining() method

        Iterator itr=list.iterator();
        itr.forEachRemaining(c->{ // here using lambda expression
            System.out.println(c);
        });
    }
}