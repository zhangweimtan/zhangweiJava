<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-28
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        //创建对象
        function ajaxFunction() {
            var xmlHttp;
            try { // Firefox, Opera 8.0+, Safari
                xmlHttp = new XMLHttpRequest();
            }
            catch (e) {
                try {// Internet Explorer
                    xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
                }
                catch (e) {
                    try {
                        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
                    }
                    catch (e) {
                    }
                }
            }

            return xmlHttp;
        }

        //处理get请求

        //处理post请求
        function post() {
            var request = ajaxFunction();

            //post方法,需要添加头，
            request.open("POST", "DemoServlet01", true);

            //响应
            request.onreadystatechange = function () {
                //判断响应正常4,200
                if (request.readyState == 4 && request.status == 200) {
                    //弹出相应的信息
                    alert(request.responseText);
                }
            }
            //发送请求，带数据，写header格式，经过url编码

            request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            request.send("name=cb&age=19");
        }
    </script>
</head>
<body>
<h3><a href="" onclick="post()">使用Ajax方式post请求</a></h3>

</body>
</html>
