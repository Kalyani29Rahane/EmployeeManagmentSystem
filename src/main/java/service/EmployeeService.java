package service;

import java.sql.*;

public class EmployeeService {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company", "root", "Wj28@krhps");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

