package com.myjdbc.curd.test;


import com.myjdbc.util.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.myjdbc.util.JDBCUtil.getConn;
import static com.myjdbc.util.JDBCUtil.release;

public class TestSQL {
    @Test
    private void testSql(){
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
            release(conn,st,rs);
        }
    }
    @Test
    public void testInsert(){
        Connection conn = null;
        Statement st = null;
        try {
            //添加
            //1,获取连接对象，ctrl alt v
            conn = getConn();
            //2,根据连接，得到statement
            st = conn.createStatement();
            String sql = "INSERT INTO student (NAME,grade,class,age,gender) VALUES ('zhangsanwu',87,'3-3',15,1)";
            //3,执行sql语句
            int i = st.executeUpdate(sql);
            //返回的数值，如果大于0，即成功，否则失败
            if(i>0){
                System.out.println("添加成功！");
            }else {
                System.out.println("添加失败！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            release(conn,st);
        }
    }
    @Test
    public void testDelete(){
        Connection conn = null;
        Statement st = null;
        try {
            //删除
            //1,获取连接对象，ctrl alt v
            conn = getConn();
            //2,根据连接，得到statement
            st = conn.createStatement();
            String sql = "delete from student where id = 5";
            //3,执行sql语句
            int i = st.executeUpdate(sql);
            //返回的数值，如果大于0，即成功，否则失败
            if(i>0){
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            release(conn,st);
        }

    }

    @Test
    public void testUpdate(){
        Connection conn = null;
        Statement st = null;
        try {
            //修改update student set age = 16 where id = 7
            //1,获取连接对象，ctrl alt v
            conn = getConn();
            //2,根据连接，得到statement
            st = conn.createStatement();
            String sql = "update student set is_delete = 1 where id = 7";
            //3,执行sql语句
            int i = st.executeUpdate(sql);
            //返回的数值，如果大于0，即成功，否则失败
            if(i>0){
                System.out.println("修改成功！");
            }else {
                System.out.println("修改失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            release(conn,st);
        }

    }

}

