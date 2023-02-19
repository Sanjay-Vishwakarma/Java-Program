package collection_com._01arraylist;

// Java ArrayList example to remove elements


import java.util.ArrayList;


public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("dog");
        al1.add("cat");
        al1.add("horse");
        al1.add("deer");
        System.out.println("an initial list: " + al1);

//
        al1.remove("cat");
        System.out.println("after removed the elememnt: " + al1);

        al1.remove(0);
        System.out.println("after using index  removed the elememnt: " + al1);

//         Creating another arraylist

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("lion");
        al2.add("tiger");

//        addiing new elemnets in the arraylist
        al1.addAll(al2);
        System.out.println("updated elements:" + al1);

// removing elements from the array list

        al1.removeAll(al2);
        System.out.println("after remove the element using removeAll() method: " + al1);

        al1.removeIf(str -> str.contains("deer"));  // using lambda exression
        System.out.println("removng elements:" + al1);


//        removing al the leememngt in the arraylist

        al1.clear();
        System.out.println(al1);

    }
}
