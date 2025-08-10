package day8;
import java.util.*;
//8. Convert LinkedList to ArrayList:
//
//Create a LinkedList of Strings.
//
//Convert it into an ArrayList.
//
//Display both the LinkedList and ArrayList.
public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A","B","C"));
        ArrayList<String> al = new ArrayList<>(ll);
        System.out.println(ll);
        System.out.println(al);
    }
}
