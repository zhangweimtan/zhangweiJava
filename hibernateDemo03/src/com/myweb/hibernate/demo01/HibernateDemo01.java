package com.myweb.hibernate.demo01;

import com.myweb.hibernate.domain.Customer;
import com.myweb.hibernate.domain.LinkMan;
import com.myweb.hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class HibernateDemo01 {
//    一对多的测试类

    @Test
    //保存2个客户和三个联系人，且建立好联系
    public void demo01(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //创建两个客户
        Customer customer1 = new Customer();
        customer1.setCust_name("zhangsan");
        Customer customer2 = new Customer();
        customer2.setCust_name("lisisi");
        //创建三个联系人
        LinkMan linkMan1 = new LinkMan();
        linkMan1.setLkm_name("wahaha");
        LinkMan linkMan2 = new LinkMan();
        linkMan2.setLkm_name("nongfu");
        LinkMan linkMan3 = new LinkMan();
        linkMan3.setLkm_name("chapai");
        //设置关系
        linkMan1.setCustomer(customer1);
        linkMan2.setCustomer(customer1);
        linkMan3.setCustomer(customer2);
        customer1.getLinkManSet().add(linkMan1);
        customer1.getLinkManSet().add(linkMan2);
        customer2.getLinkManSet().add(linkMan3);
        //保存数据

        session.save(linkMan1);
        session.save(linkMan2);
        session.save(linkMan3);
        session.save(customer1);
        session.save(customer2);

        transaction.commit();



    }

    @Test
    //一对多简易设置
    public void demo02(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //创建客户
        Customer customer = new Customer();
        customer.setCust_name("gongli");
        //创建联系人
        LinkMan linkMan1 = new LinkMan();
        linkMan1.setLkm_name("ruhua");
        //建立联系
        customer.getLinkManSet().add(linkMan1);
        linkMan1.setCustomer(customer);
        //保存一方报错，级联操作


        transaction.commit();
    }

    @Test
    //一对多简易设置，级联操作,操作的对象是客户，在客户映射文件配置
//    <set name="linkManSet" cascade="save-update">
    public void demo03(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //创建客户
        Customer customer = new Customer();
        customer.setCust_name("gongli");
        //创建联系人
        LinkMan linkMan1 = new LinkMan();
        linkMan1.setLkm_name("ruhua");
        //建立联系
        customer.getLinkManSet().add(linkMan1);
        linkMan1.setCustomer(customer);
        //级联操作，保存或者更新
        session.save(customer);

        transaction.commit();
    }

    @Test
    //一对多简易设置，级联操作,操作的对象是联系人，在联系人映射文件配置
//     <many-to-one name="customer" cascade="save-update"
    public void demo04(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //创建客户
        Customer customer = new Customer();
        customer.setCust_name("qiuxiang");
        //创建联系人
        LinkMan linkMan1 = new LinkMan();
        linkMan1.setLkm_name("baihu");
        //建立联系
        customer.getLinkManSet().add(linkMan1);
        linkMan1.setCustomer(customer);
        //级联操作，保存或者更新
        session.save(linkMan1);

        transaction.commit();
    }

    @Test
    /*
    * 测试对象的导航
    *
    * */
    public void demo05(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        //创建客户
        Customer customer = new Customer();
        customer.setCust_name("spring");
        //创建联系人
        LinkMan linkMan1 = new LinkMan();
        linkMan1.setLkm_name("boot");
        LinkMan linkMan2 = new LinkMan();
        linkMan2.setLkm_name("cloud");
        LinkMan linkMan3 = new LinkMan();
        linkMan3.setLkm_name("tools");
        //建立联系

        linkMan1.setCustomer(customer);
        customer.getLinkManSet().add(linkMan2);
        customer.getLinkManSet().add(linkMan3);
        //级联操作，保存或者更新,双方都设置了cascade
//        session.save(linkMan1);
        session.save(customer);
        transaction.commit();
    }

    @Test
    /*
    * 级联删除
    * 删除的主体是客户，在客户的的映射文件中设置
    *
    * */
    public void demo06(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
       //默认情况，效果不好，修改联系人外键，删除客户
        /*Customer customer = session.get(Customer.class,1l);
        session.delete(customer);*/
        //删除客户，同时删除联系人
        Customer customer = session.get(Customer.class,1l);
        session.delete(customer);
        transaction.commit();
    }

    @Test
    /*
    * 更改联系人归属，2号联系人归2号客户
    *客户端，一的一方放弃
    * */
    public void demo07(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
       //更改联系人
        LinkMan linkMan = session.get(LinkMan.class, 2l);
        Customer customer = session.get(Customer.class, 2l);
        //双向关联
        linkMan.setCustomer(customer);
        customer.getLinkManSet().add(linkMan);

        transaction.commit();
    }



    @Test
    /*
    * cascade 与inverse的区别，客户，联系人都会插入到数据库，但是外键为Null，因为客户放弃外键维护
    * */
    public void demo08(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //创建客户
        Customer customer = new Customer();
        customer.setCust_name("qiuxiang");
        //创建联系人
        LinkMan linkMan1 = new LinkMan();
        linkMan1.setLkm_name("baihu");
        //客户管理联系人

//        customer.getLinkManSet().add(linkMan1);
//        session.save(customer);//外键为空

        linkMan1.setCustomer(customer);
        session.save(linkMan1);//正常外键

        transaction.commit();
    }


}
