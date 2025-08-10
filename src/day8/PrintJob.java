package day8;
//PriorityQueue 2. Print Jobs Priority:
//
//Add different print jobs (String) with priority levels.
//
//Use PriorityQueue to simulate serving high-priority jobs before others.
public class PrintJob implements Comparable<PrintJob> {
    String job; int priority;
    public PrintJob(String job, int priority) { this.job=job; this.priority=priority; }
    public int compareTo(PrintJob p) { return Integer.compare(p.priority, priority); }
    public String toString() { return job+" "+priority; }
}
