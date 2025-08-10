package day11;
import java.sql.*;
// Use PreparedStatement to insert multiple student records into the database.


public class InsertMultipleStudents {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("INSERT INTO student(id, name, percentage) VALUES(?,?,?)");
        ps.setInt(1,2);
        ps.setString(2,"Neha");
        ps.setDouble(3,90.0);
        ps.executeUpdate();
        ps.setInt(1,3);
        ps.setString(2,"Rahul");
        ps.setDouble(3,65.0);
        ps.executeUpdate();
        con.close();
    }
}
