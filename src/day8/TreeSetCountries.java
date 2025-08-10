package day8;
import java.util.*;
//TreeSet 1. Create a TreeSet of Strings:
//
//Add 5 country names in random order.
//
//Print the sorted list of countries using TreeSet.
public class TreeSetCountries {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("India"); ts.add("Nepal"); ts.add("USA"); ts.add("Australia"); ts.add("Japan");
        System.out.println(ts);
    }
}
