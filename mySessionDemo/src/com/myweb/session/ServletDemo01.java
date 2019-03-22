package com.myweb.session;

import javax.naming.Name;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServletDemo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String name = "zhangsan";
        String value = "18";
        //getId
        String id = session.getId();
        //setAttribute,存值
        session.setAttribute(name, value);
        //getAttribute，取值
        session.getAttribute(name);
        //removeAttribute，移除值
        session.removeAttribute(name);
    }
}
