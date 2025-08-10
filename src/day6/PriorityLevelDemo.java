package day6;

//5: Priority Levels with Extra Data
//Implement enum PriorityLevel with constants (LOW, MEDIUM, HIGH, CRITICAL), each having:
//•	A numeric severity code.
//•	A boolean isUrgent() if severity ≥ some threshold.
//Print descriptions and check urgency.

public class PriorityLevelDemo {
    enum PriorityLevel {
        LOW(1), MEDIUM(4), HIGH(7), CRITICAL(10);

        private final int severity;
        PriorityLevel(int sev) { 
        	severity = sev; 
        	}
        int severity() { 
        	return severity;
        	}
        boolean isUrgent() { 
        	return severity >= 7; 
        	}
    }

    public static void main(String[] args) {
        for (PriorityLevel pl : PriorityLevel.values()) {
            System.out.println(pl + ": Severity=" + pl.severity() + ", Urgent=" + pl.isUrgent());
        }
    }
}
