package com.stx.util;

import java.sql.*;

public class jdbcUtil {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";
        String username ="root";
        String password="xuhao980418";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement =connection.createStatement();
        String sql = "select * from my_test";
        ResultSet resultSet =statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println(resultSet.getObject("id"));
            System.out.println(resultSet.getObject("name"));
            System.out.println(resultSet.getObject("pwd"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

}
