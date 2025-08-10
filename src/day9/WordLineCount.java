package day9;
import java.io.*;
//File Handling Q4: Count Words and Lines


public class WordLineCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
        int lines=0, words=0; String line;
        while((line=br.readLine())!=null) {
            lines++;
            words += line.split("\\s+").length;
        }
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        br.close();
    }
}
