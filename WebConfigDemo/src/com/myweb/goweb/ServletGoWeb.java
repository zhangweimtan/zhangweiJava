package com.myweb.goweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletGoWeb", urlPatterns = "/goWeb")
public class ServletGoWeb extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //跳转
        response.setStatus(302);
        response.setHeader("Location", "http://10.0.7.110:5000");
        System.out.println("登陆本地服务器。。。");
    }
}
