package day8;
import java.util.*;

//10. Clone a LinkedList:
//
//Create a LinkedList of numbers.
//
//Clone it using the clone() method.
//
//Display both original and cloned lists.

public class LinkedListClone {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4));
        LinkedList<Integer> clone = (LinkedList<Integer>) ll.clone();
        System.out.println(ll);
        System.out.println(clone);
    }
}
