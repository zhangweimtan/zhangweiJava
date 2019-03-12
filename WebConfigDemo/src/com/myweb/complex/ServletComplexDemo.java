package com.myweb.complex;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@WebServlet(name = "ServletComplexDemo", urlPatterns = "/complex")
public class ServletComplexDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //配合数据库

        response.setContentType("text/html;charset=utf-8");
        //获得用户提交的k-v对
        /*Map<String, String[]> map = request.getParameterMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String[] values = map.get(key);
            for(int i=0; i<values.length;i++){
                String value = values[i];
                System.out.println(key+"=="+value);

            }
        }*/

       /* Enumeration<String> names = request.getParameterNames();
        String name = null;
        String
        while (names.hasMoreElements()){
            String name = names.nextElement();
            String value = request.getParameter(name);
        }*/
        //获得用户注册的用户名和密码
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        //控制台输出用户名+密码
        System.out.println(userName + "==" + password);
        //写入用户的注册信息及检验登陆
        /*InputStream is = this.getServletContext().getResourceAsStream("file/config.properties");
        Properties properties = new Properties();
        properties.load(is);
        String userName1 = properties.getProperty("username");
        String password1 = properties.getProperty("password");*/




        /*String userName1 = (String) this.getServletContext().getAttribute("username");
        String password1 = (String) this.getServletContext().getAttribute("password");
        System.out.println(userName1);
        System.out.println(password1);
        if(userName1 == null || password1 == null){
            //不然，首次登陆进入登陆页面
            this.getServletContext().setAttribute("username", userName);
            this.getServletContext().setAttribute("password", password);
            //3,校验码输入
            //4,跳转到登陆页面
            response.setStatus(302);
            response.setHeader("Location", "login.html");
            //5,检验登陆
        }
        response.setStatus(302);
        response.setHeader("Location", "index.html");*/
        String userName1 = this.getServletContext().getInitParameter("username");
        String password1 = this.getServletContext().getInitParameter("password");
        if (userName1.equals(userName) && password1.equals(password)) {
            //如果一致，注册失败，输出结果
            response.getWriter().write("用户名密码已经设置，请登录!");
            response.setHeader("Refresh", "2;login.html");
        }
        //写入注册信息，数据库




    }
}
