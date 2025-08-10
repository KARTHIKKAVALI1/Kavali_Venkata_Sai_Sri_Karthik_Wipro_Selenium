package day8;
import java.util.*;

//Stack - Convert a decimal number to binary using Stack:
//
//Input a decimal number from the user.
//
//Use a stack to convert it to binary and print the result.

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        while(n>0) {
            st.push(n%2);
            n/=2;
        }
        while(!st.empty()) System.out.print(st.pop());
    }
}
