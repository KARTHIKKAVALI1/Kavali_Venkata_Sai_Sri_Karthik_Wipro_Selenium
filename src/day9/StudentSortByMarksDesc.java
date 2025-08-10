package day9;
import java.util.*;
//Q6. Sort a list of students by marks (descending) using Comparator.


public class StudentSortByMarksDesc {
    static class Student {
        int rollNo; String name; int marks;
        public Student(int rollNo, String name, int marks) {
            this.rollNo = rollNo; this.name = name; this.marks = marks;
        }
        public String toString() { return rollNo + " " + name + " " + marks; }
    }
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student(1, "A", 92),
            new Student(2, "B", 87),
            new Student(3, "C", 99)
        );
        list.sort((a, b) -> Integer.compare(b.marks, a.marks));
        for (Student s : list) System.out.println(s);
    }
}
