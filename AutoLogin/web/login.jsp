<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-05-07
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
    <h3>登陆窗口</h3>
    <form action="LoginServlet" method="post">
        帐号：<input type="text" name="username"><br>
        密码：<input type="password" name="password" id=""><br>
        <input type="checkbox" name="auto_login">自动登陆<br>
        <input type="submit" value="登陆">
    </form>
</body>
</html>
