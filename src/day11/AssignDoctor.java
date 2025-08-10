package day11;
import java.sql.*;
//Create a Hospital Management System database. Using JDBC, implement:
// • Assign doctor
public class AssignDoctor {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("UPDATE patient SET doctor_id=? WHERE id=?");
        ps.setInt(1,101);
        ps.setInt(2,1);
        ps.executeUpdate();
        con.close();
    }
}
