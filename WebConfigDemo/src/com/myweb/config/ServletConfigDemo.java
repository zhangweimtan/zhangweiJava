package com.myweb.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletConfigDemo extends HttpServlet {

    /*
    * 在servlet中设置number参数，部署servlet成为私有化
    * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        ServletConfig config = getServletConfig();
        String number = config.getInitParameter("number");
        String key = "333";
        if(number.equals(key)){
            System.out.println("登陆servlet成功");
        }else {
            System.out.println("登陆servlet失败，需要设置参数");
            throw new IllegalArgumentException("servlet 部署需要参数，请设置number参数");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req, resp);
    }
}
