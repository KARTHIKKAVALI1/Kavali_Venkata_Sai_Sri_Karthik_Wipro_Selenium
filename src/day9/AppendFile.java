package day9;
import java.io.*;
//Q3. Append Data to a File
//Write a Java program to append a new student name to the existing student.txt file without overwriting existing data.
public class AppendFile {
    public static void main(String[] args) throws Exception {
        FileWriter w = new FileWriter("student.txt", true);
        w.write("Frank\n");
        w.close();
    }
}
