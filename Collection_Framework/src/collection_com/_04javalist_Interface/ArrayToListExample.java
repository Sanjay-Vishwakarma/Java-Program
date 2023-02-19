package collection_com._04javalist_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {
    public static void main(String[] args) {

        String[] array = {"sanjay", "deepak", "brijesh", "cool"};
        System.out.println("Here is the array:" + Arrays.toString(array));

        List<String> ll = new ArrayList<>();

        for (String str : array) {
            ll.add(str);
        }
        System.out.println(ll);
    }

}
