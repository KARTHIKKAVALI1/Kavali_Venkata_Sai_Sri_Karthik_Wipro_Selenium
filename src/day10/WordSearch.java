package day10;
import java.io.BufferedReader;
import java.io.FileReader;
//Question 12: Write a program to search for a specific word in a file and count its occurrences.
public class WordSearch {
    public static void main(String[] args) throws Exception {
        String word = "Hello";
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\s+");
            for (String w : arr) {
                if (w.equals(word)) count++;
            }
        }
        br.close();
        System.out.println("Occurrences: " + count);
    }
}
