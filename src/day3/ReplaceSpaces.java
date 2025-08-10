package day3;
//Replace all Spaces with Hyphens 

public class ReplaceSpaces {
    public static void main(String[] args) {
    	 String s = "abc def ghi";
         String res = "";
         for(int i=0; i<s.length(); i++) {
             char ch = s.charAt(i);
             if(ch == ' ')
                 res += '-';
             else
                 res += ch;
         }
         System.out.println(res);
    }
}
