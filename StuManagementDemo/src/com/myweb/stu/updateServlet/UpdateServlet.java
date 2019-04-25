package com.myweb.stu.updateServlet;

import com.myweb.stu.bean.Student;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "UpdateServlet",urlPatterns = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String sid = request.getParameter("sid");
        //通过sid读取数据库
        String sql = "select * from t_stu where sid ="+sid;
        StudentService service = new StudentServiceImpl();
        try {
            List<Student> list01 = service.findAll(sql);
            HttpSession session = request.getSession();
            session.setAttribute("list01", list01);
            //跳转
            request.getRequestDispatcher("update.jsp").forward(request, response);
//            response.sendRedirect("list.jsp");

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
