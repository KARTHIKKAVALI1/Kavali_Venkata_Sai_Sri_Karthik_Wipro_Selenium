package day9;
import java.io.*;
//File Handling Q2: Read from a File


public class ReadFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String line;
        while((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}
