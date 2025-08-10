package day11;
import java.sql.*;
//Implement a Java application to take dynamic input from the user and perform insertion, search, or update using menu-driven logic.


import java.util.Scanner;
public class MenuDrivenStudent {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1.Insert 2.Search 3.Update 4.Exit");
            int ch = sc.nextInt();
            if(ch == 1) {
                System.out.print("ID: "); int id = sc.nextInt();
                System.out.print("Name: "); String name = sc.next();
                System.out.print("Perc: "); double p = sc.nextDouble();
                PreparedStatement ps = con.prepareStatement("INSERT INTO student(id,name,percentage) VALUES(?,?,?)");
                ps.setInt(1,id); ps.setString(2,name); ps.setDouble(3,p);
                ps.executeUpdate();
            } else if(ch == 2) {
                System.out.print("ID: "); int id = sc.nextInt();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM student WHERE id=?");
                ps.setInt(1,id);
                ResultSet rs = ps.executeQuery();
                if(rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2));
                else System.out.println("Not found");
            } else if(ch == 3) {
                System.out.print("ID: "); int id = sc.nextInt();
                System.out.print("New Perc: "); double p = sc.nextDouble();
                PreparedStatement ps = con.prepareStatement("UPDATE student SET percentage=? WHERE id=?");
                ps.setDouble(1,p); ps.setInt(2,id);
                ps.executeUpdate();
            } else break;
        }
        con.close();
    }
}
