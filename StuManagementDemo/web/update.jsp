<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-24
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更改学生信息</title>
</head>
<body>

<h3>更改学生信息页面</h3>

<form method="post" action="Update2Servlet">
    <c:forEach items="${list01}" var="stu01">
        <table border="1" width="900">
            <tr>
                <td>编号</td>
                <td>${stu01.sid}</td>
            </tr>
            <tr>
                <td>姓名</td>
                <td>${stu01.sname}</td>
                <td><input type="text" name="sname"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td>${stu01.gender}</td>
                <td>
                    <input type="radio" name="gender" value="男">男
                    <input type="radio" name="gender" value="女">女
                </td>
            </tr>
            <tr>
                <td>电话</td>
                <td>${stu01.phone}</td>
                <td><input type="text" name="phone"></td>
            </tr>
            <tr>
                <td>生日</td>
                <td>${stu01.birthday}</td>
                <td><input type="text" name="birthday"></td>
            </tr>
            <tr>
                <td>爱好</td>
                <td>${stu01.hobby}</td>
                <td>
                    <input type="checkbox" name="hobby" value="游泳">游泳
                    <input type="checkbox" name="hobby" value="篮球">篮球
                    <input type="checkbox" name="hobby" value="足球">足球
                    <input type="checkbox" name="hobby" value="看书">看书
                    <input type="checkbox" name="hobby" value="写字">写字

                </td>
            </tr>
            <tr>
                <td>简介</td>
                <td>${stu01.info}</td>
                <td><textarea name="info" rows="3" cols="20"></textarea></td>
            </tr>
            <tr>
                <td colspan="2"> <input type="submit" value="更新"> </td>
                <%--<td colspan="2"> <input type="button" name="" value="返回"> </td>--%>
            </tr>
        </table>
    </c:forEach>
</form>
</body>
</html>
