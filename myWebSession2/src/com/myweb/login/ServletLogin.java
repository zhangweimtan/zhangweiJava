package com.myweb.login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletLogin", urlPatterns = "/login")
public class ServletLogin extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取用户提交信息
//        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        //读取servlet属性设置信息
        String contextName = this.getServletContext().getInitParameter("username");
        String contextPsd = this.getServletContext().getInitParameter("password");
        //设置response编码
//        response.setContentType("text/html;charset=utf-8");
//        request.setCharacterEncoding("UTF-8");
        //校验
        if(userName.equals(contextName) && password.equals(contextPsd)){
//            response.getWriter().write("登陆成功...");
            //跳转页面
            //早期的写法
            /*response.setStatus(302);
            response.setHeader("Location", "login_success.html");*/
            //最新的写法,重定向
//            response.sendRedirect("login_success.html");
            //请求转发，

            RequestDispatcher dispatcher = request.getRequestDispatcher("/login_success.html");
            dispatcher.forward(request, response);
            System.out.println("login success!");
        }else {
            response.getWriter().write("登陆失败....");
            System.out.println("login failed!");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }
}
