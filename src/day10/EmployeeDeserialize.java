package day10;
import java.io.*;

//Question 20: Write a program to deserialize the employee.ser file and display the object data.
public class EmployeeDeserialize {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee e = (Employee) in.readObject();
        in.close();
        System.out.println(e.name + " " + e.id);
    }
}
