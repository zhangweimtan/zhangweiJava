package com.myweb.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletTest", urlPatterns = "/webRec")
public class ServletTest extends HttpServlet {
    static int i = 0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      跳转get方法
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1,将别人发布的servlet的Jar包，部署到自己的环境中，需要注册web.xml，
        //2,添加参数，使用servlet时，必须要在web.xml里面，声明init-params
        //3,记录来访次数
        System.out.println("来了一个请求");
        i++;
        System.out.println("访问的次数："+i);
        PrintWriter out = response.getWriter();
        out.write("<h1>welcome to this web!</h1>");
    }
}
