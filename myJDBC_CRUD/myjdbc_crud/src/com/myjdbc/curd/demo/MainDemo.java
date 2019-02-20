package com.myjdbc.curd.demo;

//import java.sql.Driver;

import com.myjdbc.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MainDemo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //查询
            //1,获取连接对象，ctrl alt v
            conn = JDBCUtil.getConn();
            //2,根据连接，得到statement
            st = conn.createStatement();
            String sql = "select * from student";
            //3,执行sql语句,返回结果集
             rs = st.executeQuery(sql);
            //4,遍历结果集，输出
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int grade = rs.getInt("grade");
                String aClass = rs.getString("class");
                System.out.println("学生信息：id:"+id+" 姓名:"+name+" 年龄:"+age+" 成绩:"+grade+" 班级:"+aClass);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            JDBCUtil.release(conn,st,rs);
        }
    }
}
