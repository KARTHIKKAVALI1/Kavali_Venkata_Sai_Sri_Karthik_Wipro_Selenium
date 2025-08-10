package day8;
import java.util.*;

//3. Insert Element at Specific Position:
//
//Create a LinkedList of names.
//
//Insert a name at index 2.
//
//Display the list before and after insertion.

public class LinkedListInsert {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("A","B","C","D"));
        System.out.println(names);
        names.add(2, "X");
        System.out.println(names);
    }
}
