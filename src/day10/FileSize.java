package day10;
import java.nio.file.*;
//Question 18: Write a program to check and print the size of a file in bytes using Files.size().


public class FileSize {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("hello.txt");
        long size = Files.size(path);
        System.out.println("Size: " + size + " bytes");
    }
}
