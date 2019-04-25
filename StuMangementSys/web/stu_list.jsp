<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-18
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息管理系统</title>
</head>
<body>
    <h2 align="center">这是所有学生的信息</h2>

    <table border="1px" width="900" align="center">
        <tr align="center">
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
            <td>住址</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="stu">
            <tr align="center">
                <td>${stu.id}</td>
                <td>${stu.name}</td>
                <td>${stu.age}</td>
                <td>${stu.gender}</td>
                <td>${stu.address}</td>
                <td><a href="#">更新</a>     <a href="#">删除</a></td>

            </tr>
        </c:forEach>
    </table>


</body>
</html>
