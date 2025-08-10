package day11;
import java.sql.*;
//Write a Java program to connect to a MySQL database using JDBC.


public class JdbcConnect {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        System.out.println("Connected");
        con.close();
    }
}
