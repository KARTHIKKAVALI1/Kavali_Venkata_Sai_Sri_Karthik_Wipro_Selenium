package day8;
import java.util.*;
//PriorityQueue 2. Print Jobs Priority:
//
//Add different print jobs (String) with priority levels.
//
//Use PriorityQueue to simulate serving high-priority jobs before others.
public class PrintJobs {
    public static void main(String[] args) {
        PriorityQueue<PrintJob> pq = new PriorityQueue<>();
        pq.add(new PrintJob("job1",2));
        pq.add(new PrintJob("job2",5));
        pq.add(new PrintJob("job3",1));
        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
