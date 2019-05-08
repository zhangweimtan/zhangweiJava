package com.myweb.findservlet;

import com.myweb.bean.City;
import com.myweb.dao.CityDao;
import com.myweb.daoImpl.CityDaoImpl;
import com.thoughtworks.xstream.XStream;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CityServlet02", urlPatterns = "/CityServlet02")
public class CityServlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        try {
            //获取参数
            int pid = Integer.parseInt(request.getParameter("pid"));
            //查找城市
            CityDao dao = new CityDaoImpl();
            List<City> list = dao.findCity(pid);
            //3.把list结合转成json数据
//            JSONArray---数组，集合[]
            //JSONObject--简单数据{name:aaa,age:18}
            JSONArray jsonArray = JSONArray.fromObject(list);
            String json = jsonArray.toString();
            System.out.println("json="+json);

            response.getWriter().write(json);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
