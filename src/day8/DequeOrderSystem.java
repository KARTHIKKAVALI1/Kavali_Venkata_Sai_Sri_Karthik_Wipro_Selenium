package day8;
import java.util.*;

//2.	Double-ended Order System:
// o	Add items from front and rear.
// o	Remove items from both ends.
// o	Display contents of the deque after each operation.

public class DequeOrderSystem {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add items from front and rear
        deque.addFirst("Item1");
        System.out.println("After addFirst(Item1): " + deque);

        deque.addLast("Item2");
        System.out.println("After addLast(Item2): " + deque);

        deque.addFirst("Item3");
        System.out.println("After addFirst(Item3): " + deque);

        deque.addLast("Item4");
        System.out.println("After addLast(Item4): " + deque);

        // Remove items from both ends
        String removedFront = deque.removeFirst();
        System.out.println("After removeFirst(): " + removedFront + ", Deque: " + deque);

        String removedLast = deque.removeLast();
        System.out.println("After removeLast(): " + removedLast + ", Deque: " + deque);
    }
}
