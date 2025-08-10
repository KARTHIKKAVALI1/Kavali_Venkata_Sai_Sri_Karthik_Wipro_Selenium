package day10;
import java.io.FileWriter;
//Question 5:
//Write a program to append a line of text to an existing file.
public class AppendToFile {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("hello.txt", true);
        fw.write("\nThis is appended line.");
        fw.close();
    }
}
