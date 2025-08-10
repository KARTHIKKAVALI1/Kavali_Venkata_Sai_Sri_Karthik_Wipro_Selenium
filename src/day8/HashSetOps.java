package day8;
import java.util.*;

//HashSet 2. Perform operations:
//
//Remove an element.
//
//Check if a city (element) exists.
//
//Clear the entire HashSet.

public class HashSetOps {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(Arrays.asList("A","B","C","D"));
        hs.remove("B");
        System.out.println(hs.contains("C"));
        hs.clear();
        System.out.println(hs);
    }
}
