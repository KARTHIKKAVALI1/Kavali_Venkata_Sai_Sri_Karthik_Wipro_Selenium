package day9;
import java.io.*;
import java.util.*;
//File Handling Q11: Print All Files in a Directory


public class ListFilesInDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File dir = new File(path);
        File[] files = dir.listFiles();
        if(files!=null){
            for(File f : files){
                if(f.isFile())
                    System.out.println(f.getName());
            }
        }
    }
}
