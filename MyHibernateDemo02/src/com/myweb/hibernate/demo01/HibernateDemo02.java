package com.myweb.hibernate.demo01;

import com.myweb.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.io.Serializable;

/*
* hibernate的持久化类的三种状态
* */
public class HibernateDemo02 {

    @Test
    public void demo01(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //事务
        Customer customer = new Customer();//瞬时态
        customer.setCust_name("zhangwendong");
        Serializable id = session.save(customer);//

        transaction.commit();
        session.close();
        System.out.println(id);
    }
}
