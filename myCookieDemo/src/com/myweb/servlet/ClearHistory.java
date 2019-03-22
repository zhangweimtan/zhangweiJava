package com.myweb.servlet;

import com.myweb.util.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ClearHistory", urlPatterns = "/ClearHistory")
public class ClearHistory extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //清除cookie
//        Cookie[] cookies = request.getCookies();
//        Cookie cookie = CookieUtil.findCookie(cookies, "history");
        Cookie cookie = new Cookie("history", "");
        cookie.setMaxAge(0);
        cookie.setPath("/ProductInfo");
        response.addCookie(cookie);
        //跳转当前界面
        response.sendRedirect("product_list.jsp");
    }
}
