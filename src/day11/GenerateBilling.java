package day11;
import java.sql.*;
//Create a Hospital Management System database. Using JDBC, implement:
//• Generate billing
public class GenerateBilling {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("INSERT INTO billing(patient_id, amount) VALUES(1,3000)");
        ps.executeUpdate();
        con.close();
    }
}
