package day9;
import java.util.*;
//Q1. Sort a list of students by roll number (ascending) using Comparable.

public class StudentSortByRollNo {
    static class Student implements Comparable<Student> {
        int rollNo; String name; int marks;
        public Student(int rollNo, String name, int marks) {
            this.rollNo = rollNo; this.name = name; this.marks = marks;
        }
        public int compareTo(Student s) {
            return Integer.compare(this.rollNo, s.rollNo);
        }
        public String toString() {
            return rollNo + " " + name + " " + marks;
        }
    }
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student(3, "John", 80),
            new Student(1, "Alice", 90),
            new Student(2, "Bob", 75)
        );
        Collections.sort(list);
        for (Student s : list) System.out.println(s);
    }
}
