package com.myjdbc.test;

//import java.sql.Driver;

import java.sql.*;

import static com.myjdbc.util.JDBCUtil.*;

public class MainTest {
    public static void main(String[] args) {

/*
        Driver
        define the varies,定义变量
        */
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1,2调用工具类中的注册，创建conn
            conn = getConn();
            //3,创建statement对象，跟数据库打交道，必须需要这个对象 ctrl alt v,快速創建返回對象
            st = conn.createStatement();
            //4.輸入SQL語句,執行查詢,得到結果集
            String sql = "select * from student";
            rs = st.executeQuery(sql);

            //5,循環遍歷，while循环
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("id:"+id+"--name--"+name+"--age--"+age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeRs(rs);
            closeSt(st);
            closeConn(conn);
        }

    }
}
