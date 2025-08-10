package day3;

public class RemoveSpaceInString {
//Write a program to remove all white Spaces from string 

    public static void main(String[] args) {
    	String s = "Hello World Java";
        String res = "";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != ' ')
                res += s.charAt(i);
        }
        System.out.println(res);
    }
}
