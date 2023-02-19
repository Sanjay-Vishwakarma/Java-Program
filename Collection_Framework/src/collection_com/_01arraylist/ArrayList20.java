package collection_com._01arraylist;

// java arraylist example : Book

import java.util.ArrayList;

class Book {

    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    Book(int id, String name, String author, String publisher, int quantity) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.quantity = quantity;
        this.publisher = publisher;
    }
}

public class ArrayList20 {
    public static void main(String[] args) {

//        Creating array list of book

        ArrayList<Book> al = new ArrayList<>();

        Book b1 = new Book(12, "sanjay", "sanjay", "sanjay", 12);
        Book b2 = new Book(13, "raju", "shyam", "sanehi", 20);
        Book b3 = new Book(14, "semiran", "samms", "ajay", 18);
        al.add(b1);
        al.add(b2);
        al.add(b3);

        for (Book obj : al) {
//            System.out.println(obj.id+obj.publisher+obj.quantity+obj.author+obj.name);
            System.out.println(obj.id + " " + obj.name + " " + obj.author + " " + obj.publisher + " " + obj.quantity); // parameter should be same
        }

    }
}
