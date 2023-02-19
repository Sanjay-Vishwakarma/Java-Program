package collection_com._02linkedlist_class;

//LinkedList example of book

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Book {
    int id;


    String author, publisher, name;
    int quantity;

     Book(int id, String author, String publisher, String name, int quantity) {
        this.author = author;
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.quantity = quantity;
    }
//convertinh hashcode to toString
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}

//Driver
public class LinkedListExample {
    public static void main(String[] args) {

        List<Book> list = new LinkedList<>();
//        creating book
        Book b1 = new Book(101, "james gosling", "sanjay", "java", 15);
        Book b2 = new Book(105, "sarju", "sima", "let us c", 30);
        Book b3 = new Book(109, "james ", "diva", "python", 19);
        list.add(b1);
        list.add(b2);
        list.add(b3);
//        iterating by  iterator
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println("iterating by iterator :"+itr.next());
        }
        System.out.println("------------------------------------");
        for(Book o:list)
        {
            System.out.println("iterating by for each loop :"+ o.id+" "+o.author+" "+o.publisher+" "+o.name+" "+o.quantity);
        }
    }
}
