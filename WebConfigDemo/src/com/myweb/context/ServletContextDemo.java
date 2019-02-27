package com.myweb.context;

import com.sun.source.tree.WhileLoopTree;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "ServletContextDemo", urlPatterns = "/context")
public class ServletContextDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //获取ServeltContext对象
        ServletContext context = this.getServletContext();
        //得到context所有枚举对象
        Enumeration<String> names = context.getInitParameterNames();
        //枚举遍历，得到参数
        while(names.hasMoreElements()){
            String name = names.nextElement();
            String value = context.getInitParameter(name);
            out.println(name+"=="+value);
            out.println("<br>");
        }


    }
}
