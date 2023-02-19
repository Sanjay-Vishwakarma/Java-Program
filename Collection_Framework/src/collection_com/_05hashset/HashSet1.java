package collection_com._05hashset;

import java.util.HashSet;
import java.util.Iterator;

class HashSet1 {
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        String s= String.valueOf(set.contains("Three"));
        System.out.println(s);
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}  
