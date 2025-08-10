package day8;
import java.util.*;

//1. Create and Display a LinkedList:
//
//Create a LinkedList of Strings.
//
//Add five colors to it.
//
//Display the list using a for-each loop.

public class LinkedListColors {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red","Green","Blue","Yellow","Orange"));
        for(String s : list) System.out.println(s);
    }
}
