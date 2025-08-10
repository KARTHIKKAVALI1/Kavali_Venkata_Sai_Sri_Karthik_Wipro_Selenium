package day9;
import java.util.*;
//Q11. Create a program where:
//
//Student implements Comparable to sort by name
//
//Use Comparator to sort by marks
//
//Demonstrate both sorting techniques in the same program.
public class StudentSortByNameAndMarks {
    static class Student implements Comparable<Student> {
        String name; int marks;
        public Student(String name, int marks) { this.name = name; this.marks = marks; }
        public int compareTo(Student s) { return this.name.compareTo(s.name); }
        public String toString() { return name + " " + marks; }
    }
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("Bob", 91),
            new Student("Alice", 85),
            new Student("Eve", 93)
        );
        Collections.sort(list);
        for (Student s : list) System.out.println(s);
        System.out.println("Sort by marks:");
        list.sort((a,b)->Integer.compare(b.marks, a.marks));
        for (Student s : list) System.out.println(s);
    }
}
