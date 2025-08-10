package day8;
import java.util.*;
//Stack - Create a Stack of integers and:
//
//Push 5 elements.
//
//Pop the top element.
//
//Peek the current top.
//
//Check if the stack is empty.
public class StackOps {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40); st.push(50);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.empty());
    }
}
