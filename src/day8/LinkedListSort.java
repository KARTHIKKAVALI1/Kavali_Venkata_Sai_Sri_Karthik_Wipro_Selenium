package day8;
import java.util.*;
//7. Sort a LinkedList:
//
//Create a LinkedList of integers.
//
//Add unsorted numbers.
//
//Sort the list using Collections.sort().
//
//Display the sorted list.
public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(4,1,7,2,5));
        Collections.sort(list);
        System.out.println(list);
    }
}
