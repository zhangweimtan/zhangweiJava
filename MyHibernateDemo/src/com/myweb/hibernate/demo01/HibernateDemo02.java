package com.myweb.hibernate.demo01;

import com.myweb.hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

public class HibernateDemo02 {
    @Test
    public void demo02(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //添加对象
        Customer customer = new Customer();
        customer.setCust_name("wangwu");
        session.save(customer);
        //提交
        transaction.commit();
        session.close();
    }

    @Test
    public void demo03(){

        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //查询get(),load()
        Customer customer = session.get(Customer.class, 1l);
//        Customer customer = session.load(Customer.class, 2l);
        System.out.println(customer);
        //提交
        transaction.commit();
        session.close();
    }

    @Test
    public void update(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //添加对象
//        Customer customer = new Customer();
//        customer.setCust_id(1l);
//        customer.setCust_name("wangwu");
//        session.save(customer);
        //修改方式1，
        /*
        * 创建对象，
        * */
        Customer customer = session.get(Customer.class, 1l);
        customer.setCust_name("zhangcheng");
        session.update(customer);
        //提交
        transaction.commit();
        session.close();
    }

    @Test
    public void delete(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //获得删除对象
        /*Customer customer = new Customer();
        customer.setCust_id(2l);*/
        //先查询，后删除，推荐，一对多表--级联删除
        Customer customer = session.get(Customer.class, 3l);
        session.delete(customer);
        //提交
        transaction.commit();
        session.close();
    }

    @Test
    public void findAll(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //接受hql，面对对象
        Query query = session.createQuery("from Customer ");
        List<Customer> list = query.list();
        for(Customer customer:list){
            System.out.println(customer);
        }

        //提交
        transaction.commit();
        session.close();
    }
}
