package day9;
import java.io.*;
//File Handling Q14: Replace a Word in a File


public class ReplaceWordInFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("story.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated_story.txt"));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line.replace("Java","Python")+"\n");
        }
        br.close(); bw.close();
    }
}
