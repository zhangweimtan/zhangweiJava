package com.myweb.findservlet;

import com.myweb.bean.Words;
import com.myweb.dao.WordDao;
import com.myweb.daoImpl.WordDaoImpl;
import org.apache.taglibs.standard.tag.common.core.ForEachSupport;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "FindServlet",urlPatterns = "/FindServlet")
public class FindServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //1,获取参数
        try {
            String word = request.getParameter("word");
            System.out.println("word=="+word);
            WordDao dao = new WordDaoImpl();
            List<Words> list = dao.findWord(word);
            /*for (Words words:list
                 ) {
                System.out.println("==="+words.toString());
            }*/
            //2,保存list
            request.setAttribute("list", list);
            //3,跳转
            request.getRequestDispatcher("list.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
