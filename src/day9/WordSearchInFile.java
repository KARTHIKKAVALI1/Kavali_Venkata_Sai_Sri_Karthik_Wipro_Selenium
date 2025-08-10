package day9;
import java.io.*;
import java.util.*;
//File Handling Q13: Word Search in a File

public class WordSearchInFile {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
        String line; boolean found=false;
        while((line=br.readLine())!=null){
            if(line.contains(word)){
                found = true; break;
            }
        }
        System.out.println(found?"Found":"Not Found");
        br.close();
    }
}
