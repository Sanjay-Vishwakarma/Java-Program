package collection_com._01arraylist;

// Get and Set ArrayList


import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Sanjay");
        al.add("Rahul");
        al.add("Rajesh");
        al.add("Deepak");
        al.add("Sonu");
        al.add("Sanjay");

//        accessing the element
        System.out.println("Returnning element:" + al.get(1)); //  accessing 2nd element bcz index starts from 0
//        changing the elelment
        al.add(1, "kumar");
//        traversing the list
        for (String obj : al) {
            System.out.println("After added element:\t"+obj);
        }
    }
}
