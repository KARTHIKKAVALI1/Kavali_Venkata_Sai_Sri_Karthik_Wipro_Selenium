package day8;
import java.util.*;

///Deque 3. Browser History Simulation:
//
//Implement browser back and forward navigation using two deques.
public class BrowserHistory {
    public static void main(String[] args) {
        Deque<String> back = new ArrayDeque<>();
        Deque<String> forward = new ArrayDeque<>();
        back.push("A"); back.push("B"); back.push("C");
        String current = back.pop();
        forward.push(current);
        current = back.pop();
        System.out.println("Back: "+back+", Forward: "+forward);
    }
}
