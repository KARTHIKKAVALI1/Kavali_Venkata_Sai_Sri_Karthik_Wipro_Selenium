package day8;
import java.util.*;
//LinkedHashSet 2. Create a LinkedHashSet of custom objects (e.g., Student with id and name):
//
//Override hashCode() and equals() properly.
//
//Add at least 3 Student objects.
//
//Try adding a duplicate student and check if it gets added.
public class LinkedHashSetCustomObjects {
    public static void main(String[] args) {
        LinkedHashSet<StudentLHS> lhs = new LinkedHashSet<>();
        lhs.add(new StudentLHS(1,"A"));
        lhs.add(new StudentLHS(2,"B"));
        lhs.add(new StudentLHS(3,"C"));
        lhs.add(new StudentLHS(1,"A"));
        System.out.println(lhs);
    }
}
