package day7;

//Call by Reference (Using Objects)
//4.	Create a class Box with a variable length. Write a method that modifies the value of length by passing the Box object. Show that the original object is modified.
//5.	Write a Java program to pass an object to a method and modify its internal fields. Verify that the changes reflect outside the method.
//6.	Create a class Student with name and marks. Write a method to update the marks of a student. Demonstrate the changes in the original object.

public class CallByReferenceDemo {

    static class Box {
        int length;
        Box(int length) { this.length = length; }
    }

    static class Student {
        String name;
        int marks;
        Student(String n, int m) { name = n; marks = m; }
    }

    public static void main(String[] args) {
        Box b = new Box(5);
        modifyBox(b);
        System.out.println(b.length);

        Student s = new Student("John", 50);
        updateMarks(s, 90);
        System.out.println(s.marks);

        Box b2 = new Box(7);
        passByValueDemo(b2);
        System.out.println(b2.length);

        Box b3 = new Box(10);
        assignNewObject(b3);
        System.out.println(b3.length);
    }

    static void modifyBox(Box box) {
        box.length = 20;
    }

    static void updateMarks(Student s, int newMarks) {
        s.marks = newMarks;
    }

    static void passByValueDemo(Box box) {
        box.length = 15;
    }

    static void assignNewObject(Box box) {
        box = new Box(30);
    }
}
