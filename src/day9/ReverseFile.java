package day9;
import java.io.*;
import java.util.*;
//File Handling Q8: Reverse File Content


public class ReverseFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        List<String> lines = new ArrayList<>();
        String line;
        while((line=br.readLine())!=null)
            lines.add(line);
        br.close();
        Collections.reverse(lines);
        BufferedWriter bw = new BufferedWriter(new FileWriter("reversed.txt"));
        for(String l:lines)
            bw.write(l + "\n");
        bw.close();
    }
}
