package day9;
import java.util.*;
//Q10. Use an anonymous inner class to sort a list of strings by length.


public class StringSortByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana","apple","kiwi","pear");
        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        });
        for (String s : list) System.out.println(s);
    }
}
