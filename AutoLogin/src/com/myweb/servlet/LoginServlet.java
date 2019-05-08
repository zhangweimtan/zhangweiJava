package com.myweb.servlet;

import com.myweb.dao.UserDao;
import com.myweb.daoImpl.UserDaoImpl;
import com.myweb.domain.UserBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String autoLogin = request.getParameter("auto_login");
        System.out.println(userName+"=="+password+"="+autoLogin);
        try {
            UserBean user = new UserBean(userName,password);
            UserDao dao = new UserDaoImpl();
            UserBean userBean = dao.login(user);

            if(userBean != null){
                //成功，返回数据库数据非空
                //判断自动登陆
                if("on".equals(autoLogin)){
                    //发送cookie给客户端
                    Cookie cookie = new Cookie("auto_login", userName+"#"+password);
                    cookie.setMaxAge(60*60*24*7);//7天
                    cookie.setPath("/LoginServlet");
                    response.addCookie(cookie);
                }
                response.sendRedirect("index.jsp");
                request.getSession().setAttribute("userBean",userBean );
            }else {
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
