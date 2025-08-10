package day8;
import java.util.*;
//LinkedHashSet 1. Create a LinkedHashSet of Integers:
//
//Add numbers: 10, 5, 20, 15, 5.
//
//Print the elements and observe the order.
public class LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10); lhs.add(5); lhs.add(20); lhs.add(15); lhs.add(5);
        System.out.println(lhs);
    }
}
