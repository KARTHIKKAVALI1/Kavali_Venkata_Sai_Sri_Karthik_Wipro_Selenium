package day8;
import java.util.*;
//7. Remove All Elements:
//
//Create an ArrayList of integers.
//
//Add multiple elements.
//
//Remove all elements using clear() method.
//
//Display the size of the list.
public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        nums.clear();
        System.out.println(nums.size());
    }
}
