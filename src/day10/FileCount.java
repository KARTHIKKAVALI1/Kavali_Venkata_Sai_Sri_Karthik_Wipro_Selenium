package day10;
import java.io.BufferedReader;
import java.io.FileReader;

//Question 6: Write a program to count the number of lines, words, and characters in a file.
public class FileCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
        int lines = 0, words = 0, chars = 0;
        String line;
        while ((line = br.readLine()) != null) {
            lines++;
            words += line.split("\\s+").length;
            chars += line.length();
        }
        br.close();
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}
