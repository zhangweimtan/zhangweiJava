<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-17
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>
    <h2>欢迎使用学生管理系统</h2>
    <form action="LoginServlet" method="post">
        账户：<input type="text" name="username" /><br>
        密码：<input type="password" name="password"/><br>
        <input type="submit" value="提交" />  <br>
    </form>
</body>
</html>
