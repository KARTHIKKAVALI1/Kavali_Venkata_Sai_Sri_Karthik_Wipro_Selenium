package day11;
import java.sql.*;

//Write a Java program to delete a student record from the database using JDBC.


public class DeleteStudent {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE id=?");
        ps.setInt(1, 1);
        ps.executeUpdate();
        con.close();
    }
}
