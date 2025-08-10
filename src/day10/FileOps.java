package day10;
import java.nio.file.*;
//Question 13: Write a program to create, move, and delete a file using Files and Paths.
public class FileOps {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("file1.txt");
        Files.createFile(path);
        Path dest = Paths.get("file2.txt");
        Files.move(path, dest, StandardCopyOption.REPLACE_EXISTING);
        Files.delete(dest);
    }
}
