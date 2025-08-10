package day8;
import java.util.*;

//2. Add Elements at First and Last Position:
//
//Create a LinkedList of integers.
//
//Add elements at the beginning and at the end.
//
//Display the updated list.
public class LinkedListAdd {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(12);
        ll.addLast(99);
        ll.addFirst(4);
        ll.addLast(7);
        System.out.println(ll);
    }
}
