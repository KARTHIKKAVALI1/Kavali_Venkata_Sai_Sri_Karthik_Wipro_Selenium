package day10;
import java.io.File;
//Question 8: Write a program that lists all the files in a directory.
public class ListDirectory {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] files = dir.listFiles();
        for (File f : files) System.out.println(f.getName());
    }
}
