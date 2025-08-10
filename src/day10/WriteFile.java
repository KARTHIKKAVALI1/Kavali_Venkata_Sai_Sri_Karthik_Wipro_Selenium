package day10;
import java.io.FileWriter;
//Question 3: Write a Java program to write "Hello, World!" into a file using FileWriter.


public class WriteFile {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("hello.txt");
        fw.write("Hello, World!");
        fw.close();
    }
}
