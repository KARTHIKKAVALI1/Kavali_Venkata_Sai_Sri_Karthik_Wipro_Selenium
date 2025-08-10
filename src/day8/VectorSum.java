package day8;
import java.util.*;
//Write a method that takes a Vector<Integer> and returns the sum of all elements.

public class VectorSum {
    static int sum(Vector<Integer> v) {
        int s=0;
        for(int i:v) s+=i;
        return s;
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(1,2,3));
        System.out.println(sum(v));
    }
}
