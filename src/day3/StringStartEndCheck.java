package day3;

public class StringStartEndCheck {
//Check if String  starts with “j” and end with “a” . eg. “java” 

    public static void main(String[] args) {
    	String s = "java";
        if(s.charAt(0)=='j' && s.charAt(s.length()-1)=='a')
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
