package day11;
import java.sql.*;
//Implement an update operation to modify student details in the database using JDBC.


public class UpdateStudent {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("UPDATE student SET name=? WHERE id=?");
        ps.setString(1, "Vijay");
        ps.setInt(2, 1);
        ps.executeUpdate();
        con.close();
    }
}
