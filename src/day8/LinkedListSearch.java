package day8;
import java.util.*;
//5. Search for an Element:
//
//Create a LinkedList of Strings.
//
//Ask the user for a string to search.
//
//Display if the string is found or not.
public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("One","Two","Three","Four"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(list.contains(str)) System.out.println("Found");
        else System.out.println("Not found");
    }
}
