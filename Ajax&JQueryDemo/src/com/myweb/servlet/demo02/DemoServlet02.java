package com.myweb.servlet.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DemoServlet02",urlPatterns = "/DemoServlet02")
public class DemoServlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
//        System.out.println("收到请求");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
//        response.getWriter().write("输出一份数据");
        response.getWriter().write("name="+name+">age="+age);
    }
}
