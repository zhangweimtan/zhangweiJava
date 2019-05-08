package com.myweb.dao;

import com.myweb.domain.UserBean;

import java.sql.SQLException;

public interface UserDao {
    /*
    * 执行登陆，返回该用户所有信息
    * user的信息
    * */
    UserBean login(UserBean user) throws SQLException;
}
