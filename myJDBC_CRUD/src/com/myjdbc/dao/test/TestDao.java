package com.myjdbc.dao.test;

import com.myjdbc.dao.demo.UserDao;
import com.myjdbc.dao.impl.UserImpl;
import org.junit.Test;

public class TestDao {

    @Test
    public void testFindAll(){
        UserDao dao = new UserImpl();
        dao.findAll();
    }

    @Test
    public void testInsert(){
        UserDao dao = new UserImpl();
        dao.insert("cang","101010");
    }

    @Test
    public void testDelete(){
        UserDao dao = new UserImpl();
        dao.delete(5);
    }

    @Test
    public void testUpdate(){
        UserDao dao = new UserImpl();
        dao.update("10023",6);
    }

    @Test
    public void testLogin(){
        UserDao dao = new UserImpl();
//        dao.login("zhangsan", "10086'+or '1=1");
        dao.login("zhangsan", "10086");
    }
}
