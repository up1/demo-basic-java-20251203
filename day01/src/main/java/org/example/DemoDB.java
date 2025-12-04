package org.example;

import java.sql.*;

public class DemoDB {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        try {
            Class.forName("mysql");
            conn = DriverManager.getConnection("");
            String sql = "select * from table";
            prepStmt = conn.prepareStatement(sql);
            rs = prepStmt.executeQuery();
            rs.close();
            prepStmt.close();
            conn.close();
        } catch (Exception e) {
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if(prepStmt != null){
                try {
                    prepStmt.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
