<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-12
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>JSP_action的页面</h2>
    <%--<jsp:include page="other01.jsp"></jsp:include>--%>
    <%--<jsp:forward page=""></jsp:forward>
    <jsp:param name="" value=""></jsp:param>
    <jsp:include page=""></jsp:include>--%>
    <jsp:forward page="other02.jsp">
        <jsp:param name="address" value="zhengzhou"></jsp:param>
    </jsp:forward>




</body>
</html>
