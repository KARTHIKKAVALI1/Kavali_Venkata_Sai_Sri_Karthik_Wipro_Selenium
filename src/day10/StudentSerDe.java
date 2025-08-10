package day10;
import java.io.*;
//Question 10: Write a program to serialize and deserialize a Student object to and from a file.


class Student implements Serializable {
    String name;
    int roll;
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
public class StudentSerDe {
    public static void main(String[] args) throws Exception {
        Student s = new Student("John", 1);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(s);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s2 = (Student) in.readObject();
        in.close();
        System.out.println(s2.name + " " + s2.roll);
    }
}
