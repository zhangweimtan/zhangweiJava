<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-15
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    el03页面
<jsp:forward page="el04.jsp">
    <jsp:param name="address" value="beijing"></jsp:param>
</jsp:forward>

</body>
</html>
