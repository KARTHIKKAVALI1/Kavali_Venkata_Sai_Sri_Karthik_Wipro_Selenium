package day8;
import java.util.*;
//PriorityQueue 3. Write a method:
//
//To merge two PriorityQueue<Integer> and return a sorted merged queue.
public class PQMerge {
    static PriorityQueue<Integer> mergePQ(PriorityQueue<Integer> p1, PriorityQueue<Integer> p2) {
        PriorityQueue<Integer> merged = new PriorityQueue<>(p1);
        merged.addAll(p2);
        return merged;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>(Arrays.asList(1,4,7));
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Arrays.asList(2,5,3));
        System.out.println(mergePQ(p1,p2));
    }
}
