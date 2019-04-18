package com.myweb.stu.dao;

/*
* dao定义了用户表访问规则
* */
public interface UserDao {
    //这里简单返回boolean类型，
    //开发中，登陆成功，返回用户所有信息
//    @return true:登陆成功
    //@return false:登陆失败
    boolean login(String userName, String password);
}
