package com.myweb.sessiondemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@WebServlet(name = "CartServlet", urlPatterns = "/CartServlet")
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        //1,获取用户点击超链接的id
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);
        String[] names = {"Iphone7", "xiaomi 6", "huawei 9", "sungsum 8"};
        String name = names[id];
        //2,获取购物车存放东西的session,Map集合Map<String, Integer>

        HttpSession session = request.getSession();
        //2.5 把一个map对象存放进session中，
        Map<String, Integer> map = (Map<String, Integer>) session.getAttribute("cart");
        //3,判断,一开始session为空
        if (map == null) {
            //购物车的k-v，放在map中
            map = new LinkedHashMap<>();
            session.setAttribute("cart", map);
        }
        //3.5 判断map中是否有该商品,true，+1，false =1
        if (map.containsKey(name)) {
            map.put(name, map.get(name) + 1);
        } else {
            map.put(name, 1);
        }
        //4,输出界面，跳转,单引号
        response.getWriter().write("<a href='/product.jsp'><h3>继续购物</h3></a>");
        response.getWriter().write("<a href='/cart.jsp'><h3>去购物车结算</h3></a>");

    }
}
