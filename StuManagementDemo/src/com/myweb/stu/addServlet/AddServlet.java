package com.myweb.stu.addServlet;

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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@WebServlet(name = "AddServlet",urlPatterns = "/AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        //1,获取数据库数据
        String sname = request.getParameter("sname");
        String gender = request.getParameter("gender");
        String phone = request.getParameter("phone");
//        String hobby = request.getParameter("hobby");//checkbox,parameter,集合
        String [] h = request.getParameterValues("hobby");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <h.length-1 ; i++) {
            sb.append(h[i]+"，");
        }
        sb.append(h[h.length-1]);
        String hobby = sb.toString();

       /* String hobby = Arrays.toString(h);
        hobby = hobby.substring(1, hobby.length()-1);*/
        String info = request.getParameter("info");
        String birthday = request.getParameter("birthday");//1989-10-18
        //2,添加到数据库
        //将字符串转date，
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
            Student student = new Student(sname,gender,phone,hobby,info,date);
            StudentService service = new StudentServiceImpl();
            service.insert(student);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3，跳转到list.jsp
        request.getRequestDispatcher("StudentListServlet").forward(request, response);

    }
}
