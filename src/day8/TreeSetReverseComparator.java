package day8;
import java.util.*;
//TreeSet 3. Create a TreeSet with a custom comparator:
//
//Sort strings in reverse alphabetical order using Comparator.
public class TreeSetReverseComparator {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("A"); ts.add("Z"); ts.add("K"); ts.add("E");
        System.out.println(ts);
    }
}
