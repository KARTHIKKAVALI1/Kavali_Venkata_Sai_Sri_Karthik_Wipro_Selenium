package day9;
import java.io.*;
//File Handling Q9: Store Objects in a File using Serialization


public class SerializeStudent {
    static class Student implements Serializable {
        int id; String name; int marks;
        public Student(int id,String name,int marks) {
            this.id=id;this.name=name;this.marks=marks;
        }
    }
    public static void main(String[] args)throws Exception {
        Student s = new Student(1,"Alice",95);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("student.ser"));
        o.writeObject(s);
        o.close();
    }
}
