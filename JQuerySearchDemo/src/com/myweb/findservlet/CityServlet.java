package com.myweb.findservlet;

import com.myweb.bean.City;
import com.myweb.dao.CityDao;
import com.myweb.daoImpl.CityDaoImpl;
import com.thoughtworks.xstream.XStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CityServlet",urlPatterns = "/CityServlet")
public class CityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/xml;charset=utf-8");
        try {
            //获取参数
            int pid = Integer.parseInt(request.getParameter("pid"));
            //查找城市
            CityDao dao = new CityDaoImpl();
            List<City> list = dao.findCity(pid);
            //返回数据xstream 转化bean成为xml
            XStream xStream = new XStream();
            //把id转成属性
//            xStream.useAttributeFor(City.class,"id");
            //转对象成为xml字符串
            xStream.alias("city", City.class);

            String xml = xStream.toXML(list);
            //将xml转成javabean对象
            System.out.println("xml=="+xml);
            response.getWriter().write(xml);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
