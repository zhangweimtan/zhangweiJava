package com.myweb.hibernate.demo01;

import com.myweb.hibernate.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class HibernateDemo01 {

    @Test
    public void save(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //事务逻辑
        Customer customer = new Customer();
        customer.setCust_name("鸿通");
        session.save(customer);

        transaction.commit();
        session.close();
    }

    @Test
    public void save02(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //事务逻辑
        Customer customer = new Customer();
        customer.setCust_name("何以苏达");
        session.save(customer);

        transaction.commit();
        session.close();
    }
}
