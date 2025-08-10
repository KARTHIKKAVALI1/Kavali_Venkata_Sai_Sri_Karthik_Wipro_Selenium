package day10;
import java.nio.file.*;
import java.util.List;
//Question 14: Write a program to read all lines of a file using Files.readAllLines() and print them.
public class ReadAllLines {
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("hello.txt"));
        for (String l : lines) System.out.println(l);
    }
}
