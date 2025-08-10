package day8;
import java.util.*;

//1.	Bank Queue Simulation:
// o	Create a queue of customer names using Queue<String>.
// o	Add 5 customers to the queue.
// o	Serve (remove) customers one by one and print the queue after each removal

public class BankQueueSimulation {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Customer1");
        queue.add("Customer2");
        queue.add("Customer3");
        queue.add("Customer4");
        queue.add("Customer5");

        System.out.println("Initial queue: " + queue);

        while (!queue.isEmpty()) {
            String served = queue.poll();
            System.out.println("Served: " + served);
            System.out.println("Queue after serving: " + queue);
        }
    }
}
