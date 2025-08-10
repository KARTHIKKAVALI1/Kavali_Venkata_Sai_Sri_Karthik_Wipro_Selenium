package day11;
import java.sql.*;
//Design the schema for a Library Management System and write JDBC programs for:
//  Returning a book


public class ReturnBook {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("DELETE FROM issues WHERE book_id=? AND member_id=?");
        ps.setInt(1, 1);
        ps.setInt(2, 1001);
        ps.executeUpdate();
        con.close();
    }
}
