package com.myjdbc.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
    public static void closeRs(ResultSet rs) {
        try {
            if(rs != null){
                rs.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            rs = null;
        }
    }
    public static void closeSt(Statement st){
        try {
            if(st != null){
                st.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            st = null;
        }
    }
    public static void closeConn(Connection conn){
        try {
            if(conn != null){
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            conn = null;
        }
    }
}
