package day8;
import java.util.*;
//5. Reverse the ArrayList:
//
//Create an ArrayList of characters.
//
//Add 5 characters.
//
//Reverse the list using Collections.reverse() and display it.
public class ReverseChars {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        Collections.reverse(list);
        System.out.println(list);
    }
}
