<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-05-07
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h3>注册窗口</h3>
<form action="RegisterServlet" method="post">
    帐号：<input type="text" name="username"><br>
    密码：<input type="password" name="password" ><br>
    邮箱：<input type="text" name="email"><br>
    电话：<input type="tel" name="phone" ><br>

    <input type="submit" value="注册">
</form>
</body>
</html>
