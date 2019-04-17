<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-12
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>这是other04页面</h3>
    输出<br>
    <%=pageContext.getAttribute("name")%><br>
    <%=request.getAttribute("name")%><br>
    <%=session.getAttribute("name")%><br>
    <%=application.getAttribute("name")%><br>

</body>
</html>
