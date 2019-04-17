<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-12
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    使用作用域获得数据<br>

    <%
        pageContext.setAttribute("name", "page");
        request.setAttribute("name", "request");
        session.setAttribute("name", "session");
        application.setAttribute("name", "application");
    %>

    取值<br>
    <%=pageContext.getAttribute("name")%><br>
    <%=request.getAttribute("name")%><br>
    <%=session.getAttribute("name")%><br>
    <%=application.getAttribute("name")%><br>
    <%--<jsp:forward page="other04.jsp"></jsp:forward>--%>
    <%
        response.sendRedirect("other04.jsp");
    %>
</body>
</html>
