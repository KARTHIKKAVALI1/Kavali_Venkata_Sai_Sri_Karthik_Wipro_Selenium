package day8;
import java.util.*;

//Copy all elements from one Vector to another Vector.
//
//Compare both vectors for equality.
public class VectorCopyCompare {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(Arrays.asList(1,2,3,4));
        Vector<Integer> v2 = new Vector<>();
        v2.addAll(v1);
        System.out.println(v1.equals(v2));
    }
}
