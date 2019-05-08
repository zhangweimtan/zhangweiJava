<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-29
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        function load() {
            //$("#text01")== document.getElementById("text01")
            $("#text01").load("DemoServlet02", function (responseText, statusTxt, xhr) {
                // alert("out=="+responseText);
                $("#text01").val(responseText);
            });

        }
    </script>
</head>
<body>
<h3><a href="#" onclick="load()">使用JQuery方式load请求</a></h3>
<input type="text" id="text01">

</body>
</html>
