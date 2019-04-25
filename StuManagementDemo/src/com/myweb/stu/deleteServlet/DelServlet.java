package com.myweb.stu.deleteServlet;

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
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "DelServlet",urlPatterns = "/DelServlet")
public class DelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String sid = request.getParameter("sid");
        //1,获取数据库数据

        try {
            Student student = new Student();
            student.setSid(Integer.parseInt(sid));
            StudentService service = new StudentServiceImpl();
            service.delete(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3，跳转到list.jsp
        request.getRequestDispatcher("StudentListServlet").forward(request, response);

    }
}
