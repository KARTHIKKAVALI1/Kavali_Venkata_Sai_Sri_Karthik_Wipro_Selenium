package day8;
import java.util.*;
//HashSet 3. Write a method that takes a HashSet<Integer> and returns the maximum element.

public class HashSetMax {
    static int max(HashSet<Integer> hs) {
        int mx=Integer.MIN_VALUE;
        for(int n:hs)
            if(n>mx) mx=n;
        return mx;
    }
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(1,6,2,8));
        System.out.println(max(hs));
    }
}
