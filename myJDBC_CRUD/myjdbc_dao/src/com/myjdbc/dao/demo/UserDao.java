package com.myjdbc.dao.demo;

import com.myjdbc.dao.user.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询接口，增删改查，
     */
    void findAll();

    void insert(String userName, String psd);

    void delete(int id);

    void update(String psd, int id);

    void login(String userName, String psd);
}
