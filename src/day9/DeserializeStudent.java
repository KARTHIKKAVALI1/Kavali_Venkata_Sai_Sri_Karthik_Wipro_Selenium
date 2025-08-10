package day9;
import java.io.*;
//File Handling Q10: Read Serialized Object from File


public class DeserializeStudent {
    static class Student implements Serializable {
        int id; String name; int marks;
        public String toString() { return id+" "+name+" "+marks; }
    }
    public static void main(String[] args)throws Exception {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s = (Student) o.readObject();
        System.out.println(s);
        o.close();
    }
}
