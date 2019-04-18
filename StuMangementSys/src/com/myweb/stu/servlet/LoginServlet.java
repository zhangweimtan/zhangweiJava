package com.myweb.stu.servlet;

import com.myweb.stu.dao.UserDao;
import com.myweb.stu.daoimpl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
            response.getWriter().write("登陆成功！");
        }else {
            response.getWriter().write("登陆失败！");
        }
    }
}
