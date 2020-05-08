package com.company;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class veriTabanaBaglan {
    protected Connection baglan(){
        try{
            Connection conn = getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "1234");
            return conn;
    }
        catch (SQLException e) {
            //System.out.println("Connection failure.");
            System.out.println(e.getMessage());
            //  e.printStackTrace();
            return null;
        }
    }
}
