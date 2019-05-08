package com.myweb.dao;

import java.sql.SQLException;

public interface UserDao {
    /*
    * 检验用户名存在
    * */
    boolean checkUserName(String userName) throws SQLException;
}
