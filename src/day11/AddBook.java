package day11;
import java.sql.*;
//Design the schema for a Library Management System and write JDBC programs for:
// • Adding a book
public class AddBook {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("INSERT INTO books(id, title, author) VALUES(1,'Java Basics','A Smith')");
        ps.executeUpdate();
        con.close();
    }
}
