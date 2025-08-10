package day8;
import java.util.*;
//Deque 1. Palindrome Checker:
//
//Input a string and check if it is a palindrome using a Deque<Character>.

public class DequePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Deque<Character> d = new ArrayDeque<>();
        for(char c : s.toCharArray()) d.addLast(c);
        boolean pal = true;
        while(d.size()>1)
            if(!d.pollFirst().equals(d.pollLast())) { pal=false; break; }
        System.out.println(pal?"Palindrome":"Not Palindrome");
    }
}
