package day9;
import java.util.*;
//Q13. Write a menu-driven program to sort Employee objects by name, salary, or department using Comparator.


public class EmployeeMenuSort {
    static class Employee {
        String name, dept; double salary;
        public Employee(String name, String dept, double salary) {
            this.name = name; this.dept = dept; this.salary = salary;
        }
        public String toString() { return name+" "+dept+" "+salary; }
    }
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("A","HR",20000),
            new Employee("C","IT",22000),
            new Employee("B","Sales",18000)
        );
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Name 2.Salary 3.Department");
        int ch = sc.nextInt();
        if(ch==1)list.sort(Comparator.comparing(e->e.name));
        else if(ch==2)list.sort(Comparator.comparingDouble(e->e.salary));
        else if(ch==3)list.sort(Comparator.comparing(e->e.dept));
        for(Employee e:list)System.out.println(e);
    }
}
