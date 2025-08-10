package day8;
import java.util.*;

//LinkedHashSet 3. Write a program to:
//
//Merge two LinkedHashSets and print the result.
public class MergeLHS {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh1 = new LinkedHashSet<>(Arrays.asList(1,2,3));
        LinkedHashSet<Integer> lh2 = new LinkedHashSet<>(Arrays.asList(4,5,6));
        lh1.addAll(lh2);
        System.out.println(lh1);
    }
}
