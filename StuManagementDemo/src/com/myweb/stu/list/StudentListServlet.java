package com.myweb.stu.list;

import com.myweb.stu.bean.Student;
import com.myweb.stu.dao.StudentDao;
import com.myweb.stu.daoImpl.StudentDaoImpl;
import com.myweb.stu.service.StudentService;
import com.myweb.stu.serviceImpl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/*
* 负责查询所有学生的信息
* */
@WebServlet(name = "StudentListServlet", urlPatterns = "/StudentListServlet")
public class StudentListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StudentService service = new StudentServiceImpl();
        String sql = "select * from t_stu";
        try {
            List<Student> list = service.findAll(sql);
//            HttpSession session = request.getSession();
            request.setAttribute("list", list);
            //跳转
            request.getRequestDispatcher("list.jsp").forward(request, response);
//            response.sendRedirect("list.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
