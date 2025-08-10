package day8;
import java.util.*;
//Queue 3. Write a method:
//
//That takes a queue of integers and returns a list of even numbers.
public class QueueEvenNumbers {
    static List<Integer> getEven(Queue<Integer> q) {
        List<Integer> ev = new ArrayList<>();
        for(int e:q)
            if(e%2==0) ev.add(e);
        return ev;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(2,7,4,9,6));
        System.out.println(getEven(q));
    }
}
