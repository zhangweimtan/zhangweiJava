package com.myweb.jdbc.util;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MyDataBase implements DataSource {

    List<Connection> list = new ArrayList<>();

    public MyDataBase() {
        for (int i = 0; i < 10; i++) {
            Connection conn = JDBCUtil.getConn();
            list.add(conn);
        }
    }

    //连接池对外公布的获取连接的方法
    @Override
    public Connection getConnection() throws SQLException {
        if (list.size() == 0) {
            for (int i = 0; i < 5; i++) {
                Connection conn = JDBCUtil.getConn();
                list.add(conn);
            }
        }

        //将集合中的第一个元素提取出来
        Connection conn = list.remove(0);

        return conn;
    }
    //归还连接
    public void addBack(Connection conn){
        list.add(conn);
    }


    //-------
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
