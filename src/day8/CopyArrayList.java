package day8;
import java.util.*;

//10. Copy One ArrayList to Another
//
//Create an ArrayList with some elements.
//
//Create a second ArrayList.
//
//Copy all elements from the first to the second using addAll() method.
public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<String> second = new ArrayList<>();
        second.addAll(first);
        System.out.println(second);
    }
}
