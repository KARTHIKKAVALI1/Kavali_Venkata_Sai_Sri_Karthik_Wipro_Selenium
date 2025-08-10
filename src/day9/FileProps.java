package day9;
import java.io.*;
//File Handling Q6: Check if a File Exists and Display Properties


public class FileProps {
    public static void main(String[] args) {
        File f = new File("report.txt");
        if (f.exists()) {
            System.out.println("Absolute: " + f.getAbsolutePath());
            System.out.println("Name: " + f.getName());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("Size: " + f.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
