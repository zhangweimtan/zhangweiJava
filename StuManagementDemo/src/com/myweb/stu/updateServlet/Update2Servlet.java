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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet(name = "Update2Servlet",urlPatterns = "/Update2Servlet")
public class Update2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        Date date = null;
        HttpSession session = request.getSession();
//        final Object list01 = request.getAttribute("list01");
//        Object list01 = session.getAttribute("list01");
        List<Student> list01 = (ArrayList<Student>) session.getAttribute("list01");
        Student stu01 = list01.get(0);
        //1,获取数据库数据
        String sname = request.getParameter("sname");
//        System.out.println("name=="+sname);
        String gender = request.getParameter("gender");
        String phone = request.getParameter("phone");
//        String hobby = request.getParameter("hobby");//checkbox,parameter,集合
        String hobby;
        String [] h = request.getParameterValues("hobby");
        if(h != null) {
        /*StringBuilder sb = new StringBuilder();
        for (int i = 0; i <h.length-1 ; i++) {
            sb.append(h[i]+"，");
        }
        sb.append(h[h.length-1]);
        String hobby = sb.toString();*/
            hobby= Arrays.toString(h);
            hobby = hobby.substring(1, hobby.length() - 1);
        }else{
            hobby = stu01.getHobby();
//            System.out.println(hobby);
        }
        String info = request.getParameter("info");
        String birthday = request.getParameter("birthday");//1989-10-18
        //2,添加到数据库
        //判断更新字段是否为空

//        System.out.println("--------1-----");
//        System.out.println(stu01.getSname());

        if(sname ==""){
            sname = stu01.getSname();
        }
        if(phone ==""){
            phone = stu01.getPhone();
//            System.out.println("----2----");
//            System.out.println(phone);
        }
        if(gender ==null){
            gender = stu01.getGender();
        }

        if(info ==""){
            info = stu01.getInfo();
        }
        if(birthday ==""){
            date = stu01.getBirthday();
        }else{
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        int sid = stu01.getSid();


        //将字符串转date，
        try {

            Student student = new Student(sid,sname,gender,phone,hobby,info,date);
            StudentService service = new StudentServiceImpl();
            service.update(student);
//            service.insert(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3，跳转到list.jsp
        request.getRequestDispatcher("StudentListServlet").forward(request, response);

    }
}
