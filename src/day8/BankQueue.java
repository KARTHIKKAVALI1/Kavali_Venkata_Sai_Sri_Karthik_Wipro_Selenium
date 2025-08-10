package day8;
import java.util.*;

//Queue 1. Bank Queue Simulation:

//Create a queue of customer names using Queue<String>.
//
//Add 5 customers to the queue.
//
//Serve (remove) customers one by one and print the queue after each removal.
public class BankQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("A"); q.add("B"); q.add("C"); q.add("D"); q.add("E");
        while(!q.isEmpty()) {
            q.poll();
            System.out.println(q);
        }
    }
}
