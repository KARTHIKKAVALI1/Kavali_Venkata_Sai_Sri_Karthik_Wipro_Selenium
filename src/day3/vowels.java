package day3;

public class vowels {
//Count number of vowels in a string(input=”Programming”, output=3 Vowels) 

    public static void main(String[] args) {
    	String s = "Programming";
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
                ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
