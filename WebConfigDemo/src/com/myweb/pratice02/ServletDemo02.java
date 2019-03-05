package com.myweb.pratice02;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(name = "ServletDemo02", urlPatterns = "/demo02")
public class ServletDemo02 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1,获取数据，跳转后的数据
        ServletContext context = this.getServletContext();
        response.setContentType("text/html;charset=utf-8");
//        Properties properties = new Properties();
        PrintWriter out = response.getWriter();
        //2,读取图片数据流
//        InputStream is = context.getResourceAsStream("imgs/movie001.png");
//        properties.load(is);
//        response.setStatus(302);
//        response.setHeader("Location", "imgs/
        ServletOutputStream os = response.getOutputStream();

        out.print("<img src='imgs/movie001.png'/>");
//        is.close();



    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

}
