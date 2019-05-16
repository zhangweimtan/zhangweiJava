package com.myweb.hibernate.demo01;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;



/*
* hibernate 入门
* */
public class HibernateDemo01 {
    @Test
//  保存客户案例
    public void demo01(){
        //1,加载hbm核心配置文件
        Configuration configuration = new Configuration().configure();
        //2,创建sessionFactory对象，类似于jdbc连接池
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //3，通过sessionFactory获取Session对象，类似于jdbc中的connection
        Session session = sessionFactory.openSession();
//        Session currentSession = sessionFactory.getCurrentSession();
        //4，开启事务：
        Transaction transaction = session.beginTransaction();
        //5，编写代码
        Customer customer = new Customer();
        customer.setCust_name("zhangsan");
        session.save(customer);
        //6,提交
        transaction.commit();
        //7，释放资源
        session.close();
    }

    @Test
    //更新
    public void demo02(){
        //1,加载hbm核心配置文件
        Configuration configuration = new Configuration().configure();
        //2,创建sessionFactory对象，类似于jdbc连接池
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //3，通过sessionFactory获取Session对象，类似于jdbc中的connection
        Session session = sessionFactory.openSession();
//        Session currentSession = sessionFactory.getCurrentSession();
        //4，开启事务：
        Transaction transaction = session.beginTransaction();
        //5，编写代码
        Customer customer = new Customer();

        customer.setCust_name("lisi");
//        session.update("cust_name",customer);
        session.save(customer);
        //6,提交
        transaction.commit();
        //7，释放资源
        session.close();
    }
}
