package com.myweb.stu.serviceImpl;

import com.myweb.stu.bean.PageBean;
import com.myweb.stu.bean.Student;
import com.myweb.stu.dao.StudentDao;
import com.myweb.stu.daoImpl.StudentDaoImpl;
import com.myweb.stu.service.StudentService;

import java.sql.SQLException;
import java.util.List;

/*
*负责查询所有学生的信息，然后呈现在list.jsp
 *  */

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAll(String sql) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.findAll(sql);
    }

    @Override
    public void insert(Student student) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
//        for (int i = 0; i < 50; i++) {
//            dao.insert(student);
//        }
        dao.insert(student);
    }

    @Override
    public void update(Student student) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.update(student);
    }
    @Override
    public void delete(Student student) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.delete(student);
    }

    @Override
    public List<Student> search(String sname, String sgender) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.search(sname, sgender);
    }

    @Override
    public PageBean<Student> findByPage(int page) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        PageBean<Student> pageBean = new PageBean<>();
        pageBean.setCurrentPage(page);//当前页的页码
        int pageSize = StudentDao.PAGE_SIZE;
        pageBean.setPageCount(pageSize);//常量直接调用，当前页的信息数
        List<Student> list = dao.findByPage(page);
        pageBean.setList(list);//当前页的集合
        //总页码==总记录数%5
        //总记录数
        //select count(*) from t_stu;
        int count = this.countAll();
//        System.out.println("总记录数=="+count);
        pageBean.setTotalCount(count);
//        int pages = count / 5;//取整,%5,整除 /5，不整除，/5 +1
        pageBean.setTotalPage(count % pageSize ==0 ? count/pageSize:count/pageSize+1 );//

        return pageBean;
    }

    @Override
    public int countAll() throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.countAll();
    }
}
