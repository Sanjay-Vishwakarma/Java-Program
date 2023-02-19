package collection_com._01arraylist;

// Java ArrayList serialization and Deserialization

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArrayList6 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("rahul");
        al.add("sanjay");
        al.add("amit");
        al.add("Aman");
        try {

//            serialization
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();

//            Deserialization

            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list = (ArrayList) ois.readObject();
            System.out.println(list);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
