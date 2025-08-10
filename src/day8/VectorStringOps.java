package day8;
import java.util.*;
//Create a Vector of Strings and:
//
//Add at least 4 names.
//
//Check if a specific name exists in the vector.
//
//Replace one name with another.
//
//Clear all elements from the vector.
public class VectorStringOps {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList("A","B","C","D"));
        System.out.println(v.contains("B"));
        v.set(0,"Z");
        v.clear();
        System.out.println(v);
    }
}
