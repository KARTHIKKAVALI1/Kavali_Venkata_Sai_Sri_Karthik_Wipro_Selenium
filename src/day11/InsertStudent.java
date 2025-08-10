package day11;
import java.sql.*;

//Create a Java class to insert student records into a database table.


public class InsertStudent {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO student(id, name, percentage) VALUES(1,'Ajay',85.5)");
        con.close();
    }
}
