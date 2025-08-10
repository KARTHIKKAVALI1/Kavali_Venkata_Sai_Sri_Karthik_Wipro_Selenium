package day3;

public class SplitSentenceToWords {
	//Split a sentence into words 

    public static void main(String[] args) {
    	String s = "karthik kavali";
        String word = "";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=' ')
                word += s.charAt(i);
            else {
                System.out.println(word);
                word = "";
            }
        }
        System.out.println(word);
    }
}
