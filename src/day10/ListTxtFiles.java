package day10;
import java.io.File;
import java.io.FilenameFilter;
//Question 9: Write a program to filter and display only .txt files from a folder using FilenameFilter.


public class ListTxtFiles {
    public static void main(String[] args) {
        File dir = new File(".");
        FilenameFilter filter = (d, name) -> name.endsWith(".txt");
        String[] txtFiles = dir.list(filter);
        for (String name : txtFiles) System.out.println(name);
    }
}
