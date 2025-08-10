package day8;
import java.util.*;
//Create a Vector of integers and perform the following operations:
//
//Add 5 integers to the Vector.
//
//Insert an element at the 3rd position.
//
//Remove the 2nd element.
//
//Display the elements using Enumeration.
public class VectorIntOps {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
        v.insertElementAt(99,2);
        v.remove(1);
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()) System.out.print(e.nextElement()+" ");
    }
}
