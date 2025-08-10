package day11;
import java.sql.*;
//Write a JDBC program to handle exceptions (like invalid ID, connection errors) gracefully.


public class JdbcExceptionHandling {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM student WHERE id=?");
            ps.setInt(1, 999);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2));
            else System.out.println("Invalid ID");
            con.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
