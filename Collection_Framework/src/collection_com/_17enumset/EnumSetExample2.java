package collection_com._17enumset;

import java.util.EnumSet;
import java.util.Set;

enum days1 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample2 {
    public static void main(String[] args) {
        Set<days1> set1 = EnumSet.allOf(days1.class);
        System.out.println("Week Days:" + set1);
        Set<days1> set3 = EnumSet.noneOf(days1.class);
        System.out.println("Week Days:" + set3);
    }
}