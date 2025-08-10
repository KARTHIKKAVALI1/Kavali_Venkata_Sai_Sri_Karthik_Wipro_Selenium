package day9;
import java.util.*;
//Q5. Implement a program that sorts a list of custom objects using Comparable, and displays them before and after sorting.


public class CustomObjectSort {
    static class Item implements Comparable<Item> {
        int id; String name;
        public Item(int id, String name) { this.id = id; this.name = name; }
        public int compareTo(Item x) { return Integer.compare(this.id, x.id); }
        public String toString() { return id + " " + name; }
    }
    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
            new Item(3, "C"),
            new Item(1, "A"),
            new Item(2, "B")
        );
        for (Item i : list) System.out.println(i);
        Collections.sort(list);
        System.out.println("After Sort:");
        for (Item i : list) System.out.println(i);
    }
}
