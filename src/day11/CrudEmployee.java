package day11;
import java.sql.*;

//Design a Java application to perform all CRUD (Create, Read, Update, Delete) operations on an Employee table using JDBC.


public class CrudEmployee {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement st = con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS employee(id INT PRIMARY KEY, name VARCHAR(30), salary DOUBLE)");
        st.executeUpdate("INSERT INTO employee(id, name, salary) VALUES(101,'Raj',50000)");
        ResultSet rs = st.executeQuery("SELECT * FROM employee");
        while(rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
        PreparedStatement ps = con.prepareStatement("UPDATE employee SET salary=? WHERE id=?");
        ps.setDouble(1, 55000);
        ps.setInt(2, 101);
        ps.executeUpdate();
        ps = con.prepareStatement("DELETE FROM employee WHERE id=?");
        ps.setInt(1, 101);
        ps.executeUpdate();
        con.close();
    }
}
