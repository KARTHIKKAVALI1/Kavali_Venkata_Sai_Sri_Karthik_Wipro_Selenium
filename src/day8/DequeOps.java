package day8;
import java.util.*;
//Deque 2. Double-ended Order System:
//
//Add items from front and rear.
//
//Remove items from both ends.
//
//Display contents of the deque after each operation.

public class DequeOps {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(10); System.out.println(d);
        d.addLast(20); System.out.println(d);
        d.removeFirst(); System.out.println(d);
        d.removeLast(); System.out.println(d);
    }
}
