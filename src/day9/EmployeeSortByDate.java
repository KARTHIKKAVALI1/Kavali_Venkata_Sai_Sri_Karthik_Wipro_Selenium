package day9;
import java.util.*;
import java.time.*;
//Q8. Sort Employee objects by joining date using Comparator.



public class EmployeeSortByDate {
    static class Employee {
        String name; LocalDate joinDate;
        public Employee(String name, LocalDate d) {
            this.name = name; this.joinDate = d;
        }
        public String toString() { return name + " " + joinDate; }
    }
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("A", LocalDate.of(2023, 1, 2)),
            new Employee("B", LocalDate.of(2022, 5, 1))
        );
        list.sort(Comparator.comparing(e -> e.joinDate));
        for (Employee e : list) System.out.println(e);
    }
}
