package day10;
import java.io.File;
import java.util.Scanner;
//Question 11: Write a program to read a file using Scanner and display the tokens.


public class ScannerTokens {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("hello.txt"));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
}
