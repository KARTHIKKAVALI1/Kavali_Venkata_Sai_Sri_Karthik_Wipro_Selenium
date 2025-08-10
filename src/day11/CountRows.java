package day11;
import java.sql.*;

//Create a JDBC-based program to count the total number of rows in a table.


public class CountRows {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM student");
        rs.next();
        System.out.println("Total rows: " + rs.getInt(1));
        con.close();
    }
}
