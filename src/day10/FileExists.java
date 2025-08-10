package day10;
import java.io.File;
//Question 2: Write a program to check whether a file exists at a given path.


public class FileExists {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(file.exists());
    }
}
