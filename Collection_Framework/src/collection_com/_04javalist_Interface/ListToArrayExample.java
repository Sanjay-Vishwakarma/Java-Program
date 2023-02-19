package collection_com._04javalist_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {

        List<String> ll = new ArrayList<>();
        ll.add("sudhir");
        ll.add("kisan");
        ll.add("subham");
        String[] array=ll.toArray(new String[ll.size()]);
        System.out.println("Array list: "+Arrays.toString(array));
        System.out.println(" List: "+ll);
    }

}
