package day11;
import java.sql.*;
//Develop a program to sort student data in ascending order by name using SQL in JDBC.


public class DisplaySortedStudents {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student ORDER BY name ASC");
        while(rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        con.close();
    }
}
