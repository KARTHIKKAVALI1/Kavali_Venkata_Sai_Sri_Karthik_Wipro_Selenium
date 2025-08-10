package day9;
import java.io.*;
import java.util.*;
//File Handling Q7: Create a File and Accept User Input


public class UserInputFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("userinput.txt");
        String input = sc.nextLine();
        fw.write(input + "\n");
        fw.close();
    }
}
