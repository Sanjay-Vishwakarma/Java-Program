package collection_com._06linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

class LinkedHashSet2 {
    public static void main(String args[]) {
        LinkedHashSet<String> al = new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        LinkedHashSet al2 = new LinkedHashSet();
        al2.add(12);
        al2.add("Sanjay");
        al.addAll(al2);
        System.out.println("linked value ::" + al);
        Iterator itr = al.iterator();    // we can use <String> for specific data type
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}  