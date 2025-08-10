package day8;
import java.util.*;

//Stack - Use Stack to check for balanced parentheses in an expression:
//
//Input: (a+b) * (c-d)
//
//Output: Valid or Invalid expression

public class ParenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean balanced=true;
        for(char c:expr.toCharArray()) {
            if(c=='(') st.push(c);
            else if(c==')') {
                if(st.isEmpty()) { balanced=false; break; }
                st.pop();
            }
        }
        if(balanced && st.isEmpty()) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}
