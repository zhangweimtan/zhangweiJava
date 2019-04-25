<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-23
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生列表</title>
</head>
<body>
    <table border="1" width="900">
        <tr>
            <td>学生姓名</td>
            <td colspan="6" align="left">
                <input type="text" name="blur_name">
                <input type="button" onclick="">
            </td>
        </tr>

        <tr>
            <td colspan="8" align="right">
                <a href="add.jsp">添加</a>
            </td>
        </tr>
        <tr align="center">
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>电话</td>
            <td>生日</td>
            <td>爱好</td>
            <td>简介</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="stu">
            <tr align="center">
                <td>${stu.sid}</td>
                <td>${stu.sname}</td>
                <td>${stu.gender}</td>
                <td>${stu.phone}</td>
                <td>${stu.birthday}</td>
                <td>${stu.hobby}</td>
                <td>${stu.info}</td>
                <td><a href="UpdateServlet?sid=${stu.sid}">更新</a>  <a href="DelServlet?sid=${stu.sid}">删除</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
