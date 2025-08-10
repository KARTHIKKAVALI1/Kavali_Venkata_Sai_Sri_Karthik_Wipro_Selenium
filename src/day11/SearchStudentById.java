package day11;
import java.sql.*;
//Develop a program to search a student by ID using JDBC.


public class SearchStudentById {
    public static void main(String[] args) throws Exception {
        int searchId = 1;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM student WHERE id=?");
        ps.setInt(1, searchId);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        } else {
            System.out.println("Student not found");
        }
        con.close();
    }
}
