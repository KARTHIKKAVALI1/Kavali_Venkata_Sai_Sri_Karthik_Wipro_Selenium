package day3;

public class CharFrequency {
	//Write a program to find the frequency of each character in a string 

    public static void main(String[] args) {
    	String s = "frequency";
        boolean[] visited = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (!visited[i]) {
                int freq = 1;
                for (int j = i+1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        freq++;
                        visited[j] = true;
                    }
                }
                System.out.println(s.charAt(i) + ": " + freq);
            }
        }
    }
}
