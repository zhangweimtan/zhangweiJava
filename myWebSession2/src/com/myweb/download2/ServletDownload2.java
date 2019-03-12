package com.myweb.download2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

@WebServlet(name = "ServletDownload2", urlPatterns = "/download2")
public class ServletDownload2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
         * 思路，首先获得用户下载信息，文件名，匹配文件夹下的资源名称；
         * 然后是读写数据，InputStream, OutputStream
         * */
        //1,获得用户提交的下载信息
        String fileName = request.getParameter("filename");
        System.out.println("filename="+fileName);
        //2,读取服务器端file/文件夹下对应的文件,tomcat中托管
        InputStream is = this.getServletContext().getResourceAsStream("file/" + fileName);
        //2.5,如果文件中带有中文，需要对文件名进行编码处理
        /*
         * 如果是IE，chrome，使用URLEncoding编码
         * 如果是Firefox，使用base64编码
         *
         * filename=王道干.png
            ------
            filename=%E7%8E%8B%E9%81%93%E5%B9%B2.png//符合utf-8的编码，被浏览器阅读文件名
         * */
        //对中文的名字进行编码处理，提取到浏览器，————3.5
        //判断浏览器类型
        String clineAgent = request.getHeader("user-agent");

        if(clineAgent.contains("Firefox")){
            fileName = DownloadUtil.base64EncodeFileName(fileName);
//            System.out.println("firefox:"+fileName);
        }else {
            fileName = URLEncoder.encode(fileName, "UTF-8");
        }

        //3,写数据
        OutputStream os = response.getOutputStream();
        //3.5,重要内容，需要response-下载接口
        response.setHeader("Content-disposition", "attachment; filename=" + fileName);
        //4,读写数据
        int len;
        byte[] buffer = new byte[1024];
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        //5,释放资源
        os.close();
        is.close();
    }
}
