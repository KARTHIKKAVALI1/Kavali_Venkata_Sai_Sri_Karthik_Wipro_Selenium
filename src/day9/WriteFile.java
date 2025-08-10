package day9;
import java.io.*;
//File Handling Q1: Create and Write to a File


public class WriteFile {
    public static void main(String[] args) throws Exception {
        FileWriter w = new FileWriter("student.txt");
        w.write("Alice\nBob\nCarol\nDavid\nEva\n");
        w.close();
    }
}
