package day8;
import java.util.*;
//4. Remove Elements:
//
//Create a LinkedList of animal names.
//
//Remove the first and last elements.
//
//Remove a specific element by value.
//
//Display the list after each removal.
public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Lion","Tiger","Elephant","Wolf","Zebra"));
        animals.removeFirst();
        System.out.println(animals);
        animals.removeLast();
        System.out.println(animals);
        animals.remove("Wolf");
        System.out.println(animals);
    }
}
