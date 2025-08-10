package day7;

//8.	Write a program where you assign a new object to a reference passed into a method. Show that the original reference does not change.
class Sample {
    int number;

    Sample(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Sample[number=" + number + "]";
    }
}

public class ReferenceReassignmentDemo {

    // this Method tries to assign a new object to the passed reference
    static void assignNewObject(Sample obj) {
        System.out.println("Inside method BEFORE reassignment: " + obj);
        obj = new Sample(999); // Assigns a new object to the local copy of reference
        System.out.println("Inside method AFTER reassignment: " + obj);
    }

    public static void main(String[] args) {
        Sample original = new Sample(100);

        System.out.println("Before method call: " + original);

        assignNewObject(original); // Passing original reference

        System.out.println("After method call: " + original);
    }
}
