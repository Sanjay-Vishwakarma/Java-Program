package collection_com._02linkedlist_class;

//linkedlist example






import java.util.Iterator;
import java.util.LinkedList;


public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ravi");
        ll.add("Ajay");
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
