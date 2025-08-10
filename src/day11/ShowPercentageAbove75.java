package day11;
import java.sql.*;
//Write a program to display all students whose percentage is greater than 75 using JDBC and SQL WHERE clause.
public class ShowPercentageAbove75 {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student WHERE percentage > 75");
        while(rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        con.close();
    }
}
