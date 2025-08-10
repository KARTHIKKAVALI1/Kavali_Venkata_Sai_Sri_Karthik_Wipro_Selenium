package day8;
import java.util.*;
//6. Iterate using ListIterator:
//
//Create a LinkedList of cities.
//
//Use ListIterator to display the list in both forward and reverse directions.

public class LinkedListListIterator {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        ListIterator<String> it = cities.listIterator();
        while(it.hasNext()) System.out.print(it.next()+" ");
        System.out.println();
        while(it.hasPrevious()) System.out.print(it.previous()+" ");
    }
}
