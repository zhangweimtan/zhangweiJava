package com.myweb.properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebServlet(name = "ServletProp", urlPatterns = "/properties")
public class ServletProp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        test01();
//        test02();
        test03();

    }

    private void test03() throws IOException {
        //1,创建属性对象
        Properties properties = new Properties();
        //2,通过ClassLoader方法获得资源，转化成数据流
        //路径问题，classes文件夹与web文件夹的区别，
        //..../web/file/config.properties;.../web/classes/file/properties
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("../../file/config.properties");
        //3,获取文件，转化为数据流
//        InputStream is = context.getResourceAsStream("file/config.properties");
        //4,载入数据
        properties.load(is);
        //5,读取数据
        String name = properties.getProperty("name");

        System.out.println("name03=" + name);
        is.close();
    }

    /*
     * 根据相对路径，直接读取数据
     * */
    private void test02() throws IOException {
        //1,创建属性对象
        Properties properties = new Properties();
        //2,获得ServletContext对象
        ServletContext context = this.getServletContext();
        //3,获取文件，转化为数据流
        InputStream is = context.getResourceAsStream("file/config.properties");
        //4,载入数据
        properties.load(is);
        //5,读取数据
        String name = properties.getProperty("name");
        System.out.println("name02=" + name);
        is.close();
    }

    /*
     * 先获取路径，在获取数据
     * */
    private void test01() throws IOException {
        //1,创建属性对象
        Properties properties = new Properties();
        //2,获得ServletContext对象
        ServletContext context = this.getServletContext();
        //3,获得绝对路径，filePath必须在wen根目录下
        String path = context.getRealPath("file/config.properties");
        //3.5,将filePath下文件直接转换称数据流，获得is
//        InputStream is = context.getResourceAsStream("file/config.properties");
        InputStream is = new FileInputStream(path);

        //3,载入数据
        properties.load(is);
        //4, 读取文件
        String name = properties.getProperty("name");
        System.out.println("name01=" + name);
        is.close();
    }
}
