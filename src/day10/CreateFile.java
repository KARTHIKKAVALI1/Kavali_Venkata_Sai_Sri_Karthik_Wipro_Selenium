package day10;
import java.io.File;

//Question 1: Write a program to create a new text file named test.txt.


public class CreateFile {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");
        file.createNewFile();
    }
}
