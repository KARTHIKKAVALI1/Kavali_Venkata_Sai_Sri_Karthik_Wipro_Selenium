package day3;
//Check if a string is Palindrome 

public class StringPalendrome {
	public static void main(String[] args) {
		 String s = "karthik";
	        boolean flag = true;
	        for(int i=0; i<s.length()/2; i++) {
	            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
	                flag = false;
	                break;
	            }
	        }
	        if(flag)
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    }
}
