package com.collections;
// Java program to demonstrate
// HashMap and HashTable
import java.util.*;
import java.lang.*;
import java.io.*;
 
// Name of the class has to be "Main"
// only if the class is public
public class HashMapHashtableExample
{
    public static void main(String args[])
    {
        //----------hashtable -------------------------
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101,"ajay");
        ht.put(101,"Vijay");
        ht.put(102,null);
        ht.put(104,"Ravinash");
        ht.put(105,"Raviteja");
        ht.put(16,"Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
        //----------------hashmap--------------------------------
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(null,"Amit");
        hm.put(101,"ajay");
        hm.put(null,"Amit"); 
        hm.put(null,"Vijay");
        hm.put(102,"Rahul");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}