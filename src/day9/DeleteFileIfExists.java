package day9;
import java.io.*;
import java.util.*;
//File Handling Q12: Delete a File


public class DeleteFileIfExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        File f = new File(fname);
        if(f.exists()) f.delete();
    }
}
