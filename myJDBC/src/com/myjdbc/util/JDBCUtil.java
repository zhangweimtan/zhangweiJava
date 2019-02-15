package com.myjdbc.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    /*
    * Mysql 登陆地址，用户名，密码
    * 静态代码，全局变量
    * */
//    static String driverClass = null;
    static String url = null;
    static String name = null;
    static String psd = null;
    static {
//        Properties properties = null;
        // ctrl alt T 导入异常
        try {
            //1.创建一个属性配置对象
            Properties properties = new Properties();
            // 导入配置文件
            //两种方式，第一种文件流易于理解，第二种类加载器，去读取src下的资源文件
//            InputStream is = new FileInputStream("./src/jdbc.properties");
            InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //导入输入流
            properties.load(is);
            //读取属性
//            driverClass = properties.getProperty("driverClass");
            url = properties.getProperty("url");
            name = properties.getProperty("name");
            psd = properties.getProperty("psd");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    * 创建连接
    * connection
    * */
    public static Connection getConn(){
/*
        实现Driver静态代码块，提议加载一次，减少资源浪费
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    调用两次Driver
	    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());*/

        Connection conn = null;
        try {
            //1,注册
            //可以省略，如果有多个数据库jar包，需要注明
//            Class.forName(driverClass);
            //2,建立连接, 参数一，协议+访问的数据库，参数二：用户名，参数三，密码。
            //重要提示，多次提示timeZone问题，需在URL后加入?serverTimezone=UTC,链接数据库出现SSL安全证书问题，添加&useSSL=false解决。
            conn = DriverManager.getConnection(url, name, psd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    /*
    *
    * */
    /*
    * 释放资源
    * conn
    * st
    * rs
    * */
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
