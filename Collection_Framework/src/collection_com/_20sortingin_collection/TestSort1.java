package collection_com._20sortingin_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class TestSort1 {
    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
} 