package com.myweb.servlet;

import com.myweb.util.CookieUtil;
import com.myweb.util.IdUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductInfo", urlPatterns = "/ProductInfo")
public class ProductInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取当前用户准备浏览的商品id
        String id = request.getParameter("id");
        //获取cookie[]
        Cookie[] cookies = request.getCookies();
        //util工具找到对应id的cookie
        Cookie cookie = CookieUtil.findCookie(cookies, "history");
        response.setContentType("text/html;charset=utf-8");
        //进行判断是否首次登陆
        if (cookie == null) {
            //首次登陆,添加cookie
            Cookie c = new Cookie("history", id);
            c.setMaxAge(60 * 60 * 24);
            c.setPath("/ProductInfo");
            //返回cookie
            response.addCookie(c);
        } else {
            //有cookie
            String ids = cookie.getValue();
            //更新cookie中value（id）
            //清洗id，删除重复id，一套工具算法
            ids = IdUtil.idCount(ids, id);
            cookie.setValue(ids);
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);
            //疑问，cookie没有更新！，清楚cookie后有更新，所以不要设置cookie有效期
            System.out.println("ids==" + ids);
        }
        //跳转具体页面
        response.sendRedirect("/product_info.htm");


    }
}
