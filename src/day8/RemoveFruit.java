package day8;
import java.util.*;
//3. Remove Specific Element:
//
//Create an ArrayList of Strings.
//
//Add 5 fruits.
//
//Remove a specific fruit by name.
//
//Display the updated list.
public class RemoveFruit {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Grape", "Mango", "Lemon"));
        fruits.remove("Banana");
        System.out.println(fruits);
    }
}
