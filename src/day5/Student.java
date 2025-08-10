package day5;

//1. Student with Grade Validation & Configuration
//Ensure marks are always valid and immutable once set.
//•	Create a Student class with private fields: name, rollNumber, and marks.
//•	Use a constructor to initialize all values and enforce marks to be between 0 and 100; invalid values reset to 0.
//•	Provide getter methods, but no setter for marks (immutable after object creation).
//•	Add displayDetails() to print all fields.
//
//In future versions, you might allow updating marks only via a special inputMarks(int newMarks) method that has stricter logic (e.g. cannot reduce marks). Design accordingly.

public class Student {
    private final String name;
    private final int rollNumber;
    private final int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = (marks >= 0 && marks <= 100) ? marks : 0;
    }
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public int getMarks() { return marks; }
    public Student inputMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100 && newMarks >= this.marks) {
            return new Student(this.name, this.rollNumber, newMarks);
        }
        return this;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 85);
        Student student2 = new Student("Bob", 102, 105);
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        Student updatedStudent = student1.inputMarks(90);
        System.out.println("\nAfter updating marks:");
        updatedStudent.displayDetails();
    }
}
