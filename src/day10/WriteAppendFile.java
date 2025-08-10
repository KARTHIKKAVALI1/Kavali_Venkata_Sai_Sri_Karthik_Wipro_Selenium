package day10;
import java.nio.file.*;
import java.util.*;
//Question 15: Write a program to write data into a file using Files.write() and append using StandardOpenOption.APPEND.
public class WriteAppendFile {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("data.txt");
        Files.write(path, Arrays.asList("First line"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        Files.write(path, Arrays.asList("Second line"), StandardOpenOption.APPEND);
    }
}
