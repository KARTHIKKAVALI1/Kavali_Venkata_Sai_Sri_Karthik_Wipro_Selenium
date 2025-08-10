package day10;
import java.io.BufferedReader;
import java.io.FileReader;
//Question 4: Write a program to read the content of a file line by line using BufferedReader.


public class ReadFileBuffered {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
