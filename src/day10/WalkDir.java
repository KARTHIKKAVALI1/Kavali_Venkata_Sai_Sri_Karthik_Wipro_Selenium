package day10;
import java.nio.file.*;
//Question 16: Write a program to walk through a directory tree and display file names using Files.walk().


public class WalkDir {
    public static void main(String[] args) throws Exception {
        Files.walk(Paths.get("."))
                .forEach(p -> System.out.println(p.getFileName()));
    }
}
