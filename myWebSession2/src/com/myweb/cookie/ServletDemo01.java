package com.myweb.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDemo01",urlPatterns = "/demo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //首次客户端访问没有cookie，进行判断
        response.setContentType("text/html;charset=utf-8");
        //取客户端发送来的cookie
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println(name + "==" + value);
            }
        }
        //没有cookie就写cookie
        //先写cookie，服务器端resp
        //设置path

        Cookie cookie = new Cookie("name", "zhangsan");
        //一般设置path
        cookie.setPath("/demo01");
        response.addCookie(cookie);
        Cookie cookie2 = new Cookie("age", "32");
        response.addCookie(cookie2);


        //页面输出cookie
        response.getWriter().write("hello cookie...");

    }
}
