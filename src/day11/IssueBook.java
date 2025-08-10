package day11;
import java.sql.*;
//Design the schema for a Library Management System and write JDBC programs for:
// • Issuing a book to a member
public class IssueBook {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("INSERT INTO issues(book_id, member_id) VALUES(1,1001)");
        ps.executeUpdate();
        con.close();
    }
}
