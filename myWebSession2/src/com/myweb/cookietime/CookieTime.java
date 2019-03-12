package com.myweb.cookietime;

import com.myweb.util.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "CookieTime", urlPatterns = "/time")
public class CookieTime extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获得用户登陆信息
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/html;charset=utf-8");

        //校验用户登陆信息
        if (userName.equals("admin") && password.equals("admin")){
            System.out.println("登陆成功");
            //获取cookies
            Cookie[] cookies = request.getCookies();

            //找到last字段的cookie
            Cookie cookie = CookieUtil.findCookie(cookies, "last");
            if(cookie == null){
                //第一次登陆，对cookie设置last字段
                Cookie c = new Cookie("last", System.currentTimeMillis()+"");
                c.setMaxAge(60*60*24);
                c.setPath("/time");
                response.addCookie(c);
                response.getWriter().write("welcome..."+userName);
            }else {
                //第二次登陆,获取last字段的value
                long lastTime = Long.parseLong(cookie.getValue());
//                //转成时间类型
                Date date = new Date(lastTime);

                response.getWriter().write("welcome.."+userName+", last visit time:"+date);
//                //重置时间
                cookie.setValue(System.currentTimeMillis()+"");
                response.addCookie(cookie);
            }


        }else {
            System.out.println("登陆失败");
        }
    }
}
