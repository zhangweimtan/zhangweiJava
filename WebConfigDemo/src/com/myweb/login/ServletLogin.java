package com.myweb.login;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(name = "ServletLogin", urlPatterns = "/login")
public class ServletLogin extends HttpServlet {

//    static int count = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        * request：解析请求的信息，登陆信息
        * response：响应数据，服务器反馈给客户端
        *
        * */
        //1,获取数据
        //对request设置解码
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        String psd = request.getParameter("psd");
        //get方式按照iso-8859-1解码，或者设置tomcat中conf的server.xml
//        userName = new String(userName.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println("username:"+userName+" == password:"+psd);
        //校验
        checkLogin(response, userName, psd);


    }

    private void checkLogin(HttpServletResponse response, String userName, String psd) throws IOException {
        //2,校验对象，简单模式，实际实现过程需要JDBC，查询数据库
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //3,访问context记录,获得name,psd
        ServletContext context = this.getServletContext();
        String contextName = context.getInitParameter("username");
        String contextPsd = context.getInitParameter("psd");
        if (userName.equals(contextName) && psd.equals(contextPsd)){
            System.out.println("登陆成功");
//            out.println("登陆成功");
            contextCount(context);
//            propertyCount(context);
            //4,跳转下一个界面login_success.html,定位跳转
            int sc = 302;//重新定位状态码
            response.setStatus(sc);
            response.setHeader("Location", "login_success.html");

        }else {
            System.out.println("登陆失败");
            out.println("登陆失败，请返回");
        }
    }

    private void propertyCount(ServletContext context) throws IOException {
        InputStream is = context.getResourceAsStream("file/config.properties");
        Properties properties = new Properties();
        properties.load(is);
        int subtotal = 0;
        String count1 = properties.getProperty("count");
        if(count1 != null){
            subtotal = Integer.parseInt(count1);
//                String subtotal = Integer.toString(count);
        }
        subtotal++;
        Object count = properties.put("count", subtotal);

//        properties.setProperty("count", Integer.toString(subtotal));
        is.close();
    }

    private void contextCount(ServletContext context) {
        //统计成功次数
        Object obj = context.getAttribute("count");
//            int totalCount = (int)context.getAttribute("count");
        int totalCount = 0;
        if (obj != null){
            totalCount = (int) obj;
        }
//            System.out.println("登陆成功次数"+totalCount);
        totalCount++;
        context.setAttribute("count", totalCount);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("this is post method");
        doGet(request, response);
    }

}
