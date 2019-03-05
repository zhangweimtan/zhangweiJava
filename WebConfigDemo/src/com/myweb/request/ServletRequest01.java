package com.myweb.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "ServletRequest01", urlPatterns = "/request01")
public class ServletRequest01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获得客户端请求头
        Enumeration<String> headerNames = request.getHeaderNames();
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //while loop
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            String content = request.getHeader(header);
            System.out.println(header + "==" + content);
            out.println(header + "==" + content);
            out.println("<br>");
        }

        //获取用户提交get请求信息？。。。
        //获取所有参数，形成一个枚举集合，Map集合
        Map<String, String[]> map = request.getParameterMap();
        Set<String> keySet = map.keySet();
        //迭代器循环
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String[] values = map.get(key);
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                out.println(key + "==" + value);
                out.println("<br>");
                System.out.println(key + "=" + value);
            }
        }


    }
}
