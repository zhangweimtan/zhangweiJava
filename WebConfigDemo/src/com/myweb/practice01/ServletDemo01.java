package com.myweb.practice01;

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

@WebServlet(name = "ServletDemo01", urlPatterns = "/demo01")
public class ServletDemo01 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        test01(response);
        contextShow(response);


    }

    void test01(HttpServletResponse response) throws IOException {
        //字符流方式写数据，文字
//        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=utf-8");
//        out.write("<h1>hello web </h1>");
//        out.println("<br>");
        //以字节流形式写数据，文字，文件
        ServletOutputStream os = response.getOutputStream();

        os.write("hello web2..".getBytes());
//        contextShow(response);
    }

    private void contextShow(HttpServletResponse response) throws IOException {
        ServletContext context = this.getServletContext();
        response.setContentType("text/html;charset=utf-8");
        //获取以前登陆值
//            String count = context.getInitParameter("count");
        //统计成功次数
        int count = (int) context.getAttribute("count");
        //输出页面
        PrintWriter out = response.getWriter();
        out.println("登陆成功次数" + count);
    }

    private void propertyCount(HttpServletResponse response) throws IOException {
        Properties properties = new Properties();
        ServletContext context = this.getServletContext();
        InputStream is = context.getResourceAsStream("file/config.properties");
        properties.load(is);
        String count1 = properties.getProperty("count");
        int count = Integer.valueOf(count1);

        //输出页面
        PrintWriter out = response.getWriter();
        out.println("登陆成功次数" + count);
        is.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

}
