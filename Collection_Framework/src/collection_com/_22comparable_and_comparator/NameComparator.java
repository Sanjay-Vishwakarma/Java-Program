package collection_com._22comparable_and_comparator;

import java.util.Comparator;

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}