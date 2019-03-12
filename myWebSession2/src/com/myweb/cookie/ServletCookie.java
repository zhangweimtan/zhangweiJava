package com.myweb.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCookie", urlPatterns = "/cookie")
public class ServletCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //cookie简单使用
        response.setContentType("text/html;charset=utf-8");
        //服务器发送给客户端，保存在客户端上一份小数据
        /*
        * 方法参数要什么给什么，
        * 创建对象的几种方法：
        * 1，直接new
        * 2，单例模式|静态方法
        * 3，工厂模式构建，stu
        * StuFactory StuBuilder
        * */
        Cookie cookie = new Cookie("aa", "bb");
        //给相应一个cookie
        response.addCookie(cookie);
        //输出页面
        response.getWriter().write("请求成功。。。");
        //获取客户端的cookie
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie c: cookies) {
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name+"=="+value);
                //输出结果，除了aa==bb,还有JSESSIONID==...
            }

        }
    }
}
