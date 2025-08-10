package day11;
import java.sql.*;
//Create a Hospital Management System database. Using JDBC, implement:
//  Register new patient
public class PatientRegister {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("INSERT INTO patient(id, name, age) VALUES(1,'Kiran',40)");
        ps.executeUpdate();
        con.close();
    }
}
