package day11;
import java.sql.*;
//Design the schema for a Library Management System and write JDBC programs for:
//  Viewing all books
public class LibraryViewAllBooks {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM books");
        while(rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        con.close();
    }
}
