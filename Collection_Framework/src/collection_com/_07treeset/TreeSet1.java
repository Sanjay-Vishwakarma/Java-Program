package collection_com._07treeset;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> al = new TreeSet();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi"); // duplicate value not allowed
        al.add("Ajay");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
