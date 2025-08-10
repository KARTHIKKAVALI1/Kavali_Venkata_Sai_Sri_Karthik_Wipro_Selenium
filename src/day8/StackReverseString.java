package day8;
import java.util.*;
//Stack - Reverse a string using Stack:
//
//Input a string from the user.
//
//Use a stack to reverse and print the string.
public class StackReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()) st.push(c);
        StringBuilder rs = new StringBuilder();
        while(!st.isEmpty()) rs.append(st.pop());
        System.out.println(rs);
    }
}
