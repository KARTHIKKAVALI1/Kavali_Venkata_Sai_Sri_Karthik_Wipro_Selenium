package day8;
import java.util.*;
//9. Store Custom Objects:
//
//Create a class Student with fields: id, name, and marks.
//
//Create an ArrayList of Student objects.
//
//Add at least 3 students.
//
//Display the details using a loop.
public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"A",90));
        students.add(new Student(2,"B",80));
        students.add(new Student(3,"C",85));
        for(Student s: students)
            System.out.println(s.id+" "+s.name+" "+s.marks);
    }
}
