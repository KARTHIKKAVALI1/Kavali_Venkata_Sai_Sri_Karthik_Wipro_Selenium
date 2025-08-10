package day10;
import java.io.FileReader;
import java.io.FileWriter;

//Question 7: Write a program to copy content from one file to another using FileReader and FileWriter.
public class CopyFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("hello.txt");
        FileWriter fw = new FileWriter("copied.txt");
        int c;
        while ((c = fr.read()) != -1) fw.write(c);
        fr.close();
        fw.close();
    }
}
