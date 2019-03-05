package com.myweb.download;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "ServletDownload", urlPatterns = "/download")
public class ServletDownload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置相应数据类型
        response.setContentType("text/html;charset=UTF-8");

        //字节流形式response
        //获得用户提交信息，request.get...?filename=...
        String fileName = request.getParameter("filename");
        //读取文件
//        response.setStatus();
//        String realPath = this.getServletContext().getRealPath("imgs/" + fileName);
//        InputStream is = new FileInputStream(realPath);
        response.setHeader("Content-Disposition", "attachment;filename="+fileName);
        InputStream is = this.getServletContext().getResourceAsStream("imgs/" + fileName);
        //写入文件
        OutputStream os = response.getOutputStream();
        int len;
        byte[] buffer = new byte[1024];
        while((len = is.read(buffer)) != -1){
            os.write(buffer,0, len);
        }
        System.out.println("正在下载图片");
        os.close();
        is.close();

    }
}
