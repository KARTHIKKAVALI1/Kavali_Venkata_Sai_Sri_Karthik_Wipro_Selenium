package day8;
import java.util.*;
//4. Sort Elements:
//
//Create an ArrayList of integers.
//
//Add at least 7 random numbers.
//
//Sort the list in ascending order.
//
//Display the sorted list.
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(15, 3, 1, 9, 21, 8, 6));
        Collections.sort(nums);
        System.out.println(nums);
    }
}
