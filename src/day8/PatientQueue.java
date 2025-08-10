package day8;
import java.util.*;
//PriorityQueue 1. Hospital Emergency Queue:
//
//Create a class Patient with fields: name and severityLevel (int).
//
//Use PriorityQueue<Patient> with a comparator to serve the most critical patients first (highest severityLevel).
//
//Add patients and poll them in order of severity.
public class PatientQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(Comparator.comparingInt(p->-p.severityLevel));
        pq.add(new Patient("A",5));
        pq.add(new Patient("B",8));
        pq.add(new Patient("C",2));
        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
