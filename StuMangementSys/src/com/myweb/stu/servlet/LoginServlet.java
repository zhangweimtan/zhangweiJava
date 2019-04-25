package com.myweb.stu.servlet;

import com.myweb.stu.bean.Student;
import com.myweb.stu.dao.StuDao;
import com.myweb.stu.dao.UserDao;
import com.myweb.stu.daoimpl.StuDaoImpl;
import com.myweb.stu.daoimpl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*
 * 用于处理登陆的servlet
 * */
@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //提交的数据可能有中文
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        //获取客户端的信息
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username="+userName+">>>password="+password);
//        new UserDaoImpl().login(userName,password);
        //访问dao,确定是否能登陆
        UserDao dao = new UserDaoImpl();
        boolean isSuccess = dao.login(userName, password);
        //针对dao的返回结果，做出相应
        if (isSuccess) {
//            response.getWriter().write("登陆成功！");
            StuDao stu_dao = new StuDaoImpl();
            List<Student> list = stu_dao.findAll();
            //将集合存进作用域,session
            request.getSession().setAttribute("list", list);

            //重定向
            response.sendRedirect("stu_list.jsp");

        }else {
            response.getWriter().write("登陆失败！");
        }
    }
}
