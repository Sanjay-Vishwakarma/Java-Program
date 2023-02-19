package com;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Student tom = new Student("Tom", 7, 6, 4);
        Student rome = new Student("Rome", 9, 5, 8);
        Student jack = new Student("Jack", 6, 9, 8);
        Student simon = new Student("Simon", 10, 8, 5);
        Student darek = new Student("Darek", 10, 9, 8);

        ArrayList<Student> students = new ArrayList<>();

        students.add(tom);
        students.add(rome);
        students.add(jack);
        students.add(simon);
        students.add(darek);
 
        List<ArrayList<Student>> of = List.of(students);
        System.out.println("offfffffffffffffffffffff-----"+of);

        System.out.println("Student(s) with the highest Chemistry grade among all students:");

        int max = 0;
        String names = null;
        for (int i = 0; i < students.size(); i++) {
            if (max == students.get(i).getChemistry()) { 
                names += ", " + students.get(i).name;
            } else if (max < students.get(i).getChemistry()) {
                       max = students.get(i).getChemistry(); 
                       names = students.get(i).name; 
            }
        }
        System.out.println(names);


        System.out.println();
        System.out.println("Student(s) with the highest Mathematics grade among all students:");

        max = 0;
        names = null;
        for (int i = 0; i < students.size(); i++) {
            if (max == students.get(i).getMathematics()) {
                names += ", " + students.get(i).name;
            } else if (max < students.get(i).getMathematics()) {
                       max = students.get(i).getMathematics();
                       names = students.get(i).name; 
            }
        }
        System.out.println(names);


        System.out.println();
        System.out.println("Student(s) with the highest Physics grade among all students:");


        max = 0;
        names = null;
        for (int i = 0; i < students.size(); i++) {
            if (max == students.get(i).getPhysics()) {
                names += ", " + students.get(i).name;
            } else if (max < students.get(i).getPhysics()) {
                       max = students.get(i).getPhysics();
                       names = students.get(i).name; 
            }
        }
        System.out.println(names);

    }
}