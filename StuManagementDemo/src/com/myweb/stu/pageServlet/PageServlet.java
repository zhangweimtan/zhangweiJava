package com.myweb.stu.pageServlet;

import com.myweb.stu.bean.PageBean;
import com.myweb.stu.bean.Student;
import com.myweb.stu.service.StudentService;
import com.myweb.stu.serviceImpl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
/*
* 分页显示
* */

@WebServlet(name = "PageServlet", urlPatterns = "/PageServlet")
public class PageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        try {
//        获取页码数
            int page = Integer.parseInt(request.getParameter("page"));
            //根据指定的页数，获取数据
//            StudentService service = ;
//            List<Student> list = service.findByPage(page);
            PageBean pageBean = new StudentServiceImpl().findByPage(page);

            request.setAttribute("pageBean", pageBean);
            //跳转
            request.getRequestDispatcher("list_page.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        //跳转


    }
}
