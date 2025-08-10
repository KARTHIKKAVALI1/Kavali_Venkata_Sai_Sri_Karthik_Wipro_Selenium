package day8;

//PriorityQueue 1. Hospital Emergency Queue:
//
//Create a class Patient with fields: name and severityLevel (int).
//
//Use PriorityQueue<Patient> with a comparator to serve the most critical patients first (highest severityLevel).

public class Patient {
    String name; int severityLevel;
    public Patient(String name, int severityLevel) { this.name=name; this.severityLevel=severityLevel; }
    public String toString() { return name+" "+severityLevel; }
}
