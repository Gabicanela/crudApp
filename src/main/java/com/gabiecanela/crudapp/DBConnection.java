package com.gabiecanela.crudapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static String user = "";
    static String password = "";
    static String url = "jdbc:mysql://localhost/crud";
    static String driver = "";

    public static Connection getCon(){
        Connection con = null;
        try {
            Class.forName(driver);
            try {
                con = DriverManager.getConnection(url,user,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        return con;
    }
}
