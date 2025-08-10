package day11;
import java.sql.*;
//Create a login system using JDBC where user credentials are verified from the database.


public class LoginSystem {
    public static void main(String[] args) throws Exception {
        String user = "admin", pass = "password";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
        ps.setString(1, user);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) System.out.println("Login Success");
        else System.out.println("Login Failed");
        con.close();
    }
}