package day9;
import java.io.*;
//File Handling Q5: Copy Contents from One File to Another


public class CopyFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("source.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("destination.txt"));
        String line;
        while((line = br.readLine())!=null)
            bw.write(line+"\n");
        br.close(); bw.close();
    }
}
