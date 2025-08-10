package day10;
import java.nio.file.*;

//Question 17: Write a program to copy a file using Files.copy() with REPLACE_EXISTING option.


public class CopyFileNio {
    public static void main(String[] args) throws Exception {
        Path src = Paths.get("hello.txt");
        Path dest = Paths.get("hello_copy.txt");
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
    }
}
