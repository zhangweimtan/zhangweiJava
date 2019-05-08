package com.myweb.ajax.checkname;

import com.myweb.dao.UserDao;
import com.myweb.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CheckNameServlet",urlPatterns = "/CheckNameServlet")
public class CheckNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String userName = request.getParameter("username");
        System.out.println("username=="+userName);
        try {
            //检测是否存在
            UserDao dao = new UserDaoImpl();
            boolean isExist = dao.checkUserName(userName);
//            System.out.println("---1----");

            //2,通知页面，到底有还是没有
            if(isExist){
//                System.out.println("存在");
                response.getWriter().println(1);//存在
            }else {
//                System.out.println("不存在");
                response.getWriter().println(0);// 不存在
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
