package collection_com._01arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

//Driver
public class ArrayList5 {
    public static void main(String[] args) {
//creating user defined class object
        Student s1 = new Student(1, "jarvis", 15);
        Student s2 = new Student(4, "fiber", 20);
        Student s3 = new Student(7, "silicon", 19);
        Student s4 = new Student(10, "marc", 23);
//creating array list
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

//        Getting iterator
        Iterator itr = al.iterator();
//        traversing element of arraylist object

        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        for (Student st : al) {
            System.out.println("for each"+st.rollno + " " + st.name + " " + st.age);
        }
    }
}
