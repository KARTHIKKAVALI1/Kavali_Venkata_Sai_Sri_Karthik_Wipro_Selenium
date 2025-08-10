package day10;
import java.io.*;

//Question 19: Write a program to serialize a class Employee and store it in employee.ser.
class Employee implements Serializable {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
public class EmployeeSerialize {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee("Alice", 100);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        out.writeObject(e);
        out.close();
    }
}
