package day11;
import java.sql.*;
//Write a JDBC-based report generator that exports data from a MySQL table to a text or CSV file.


import java.io.FileWriter;
public class ExportToCsv {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");
        FileWriter fw = new FileWriter("students.csv");
        while(rs.next()) {
            fw.write(rs.getInt(1)+","+rs.getString(2)+","+rs.getDouble(3)+"\n");
        }
        fw.close();
        con.close();
    }
}
