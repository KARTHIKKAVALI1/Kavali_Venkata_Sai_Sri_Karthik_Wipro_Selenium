package day8;
import java.util.*;
//TreeSet 2. Create a TreeSet of Integers:
//
//Add some numbers and print the first and last elements.
//
//Find the elements lower than and higher than a given number using lower() and higher() methods.
public class TreeSetIntOps {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(6,8,1,4,10));
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.lower(6));
        System.out.println(ts.higher(6));
    }
}
