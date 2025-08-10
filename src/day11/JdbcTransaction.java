package day11;
import java.sql.*;
//Implement a program using transaction management in JDBC (i.e., commit and rollback).


public class JdbcTransaction {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        try {
            st.executeUpdate("INSERT INTO student(id,name,percentage) VALUES(4,'Kiran',70)");
            st.executeUpdate("INSERT INTO student(id,name,percentage) VALUES(5,'Sonia',95)");
            con.commit();
        } catch(Exception e) {
            con.rollback();
        }
        con.close();
    }
}
