package com.myjdbc.test;

//import java.sql.Driver;

import java.sql.*;

import static com.myjdbc.util.JDBCUtil.closeConn;
import static com.myjdbc.util.JDBCUtil.closeRs;
import static com.myjdbc.util.JDBCUtil.closeSt;

public class MainTest {
    public static void main(String[] args) throws SQLException {

/*
        Driver
        define the varies,定义变量
        */
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //1,注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //2,建立连接, 参数一，协议+访问的数据库，参数二：用户名，参数三，密码。
            //重要提示，多次提示timeZone问题，需在URL后加入?serverTimezone=UTC,链接数据库出现SSL安全证书问题，添加&useSSL=false解决。
            conn = DriverManager.getConnection("jdbc:mysql://localhost/zwmsql?serverTimezone=UTC&useSSL=false", "root", "8864");
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
