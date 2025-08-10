package day8;
import java.util.*;
//2. Search an Element:
//
//Create an ArrayList of integers.
//
//Ask the user to enter a number.
//
//Check if the number exists in the list.
public class SearchArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (list.contains(n)) System.out.println("Exists");
        else System.out.println("Not found");
    }
}
