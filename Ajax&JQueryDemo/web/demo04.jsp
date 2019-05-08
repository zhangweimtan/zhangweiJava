<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-29
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        function get() {
            $.get("DemoServlet02", function (data, status) {
                // alert("out=="+data);
                // $("#div01").val(data);val 用于元素中有value的属性值
                $("#div01").html(data);//get方式写入数据，html，可以设置格式
            })
        }
    </script>
</head>
<input type="button" onclick="get()" value="使用jquery的get方法发送请求">
<div id="div01" style="width: 100px; height: 100px; border: 1px solid blue;">

</div>
<body>

</body>
</html>
