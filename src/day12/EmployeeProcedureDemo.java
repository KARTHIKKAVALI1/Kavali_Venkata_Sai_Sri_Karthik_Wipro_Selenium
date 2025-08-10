package day12;

/*
 Question:
 1. Create procedure or functions for employee table:
    1) Add 5000 bonus to all employees.
    2) Print same name employees.
    3) Print highest and lowest salary from employee table.
 */
import java.sql.*;

public class EmployeeProcedureDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "root";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {

            // 1. Add 5000 Bonus to all employees
            CallableStatement cs1 = con.prepareCall("{CALL add_bonus()}");
            cs1.execute();
            System.out.println("Bonus added successfully.\n");

            // 2. Employees having duplicate names
            CallableStatement cs2 = con.prepareCall("{CALL print_duplicate_names()}");
            ResultSet rs1 = cs2.executeQuery();
            System.out.println("Employees with same names:");
            while (rs1.next()) {
                System.out.println(rs1.getString("emp_name") + " - " + rs1.getInt("count") + " times");
            }

            // 3. Print highest and lowest salary
            CallableStatement cs3 = con.prepareCall("{CALL salary_stats()}");
            ResultSet rs2 = cs3.executeQuery();
            if (rs2.next()) {
                System.out.println("\nHighest Salary: " + rs2.getDouble("highest_salary"));
                System.out.println("Lowest Salary: " + rs2.getDouble("lowest_salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
