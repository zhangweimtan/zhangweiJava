<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-15
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    从作用域中取值，先存值
    <%
//        pageContext.setAttribute("name", "zhangsan");
        session.setAttribute("name", "lisi");
    %>
    <br>指定作用域名称，在这个作用域里面取值<br>
    ${pageScope.name}

    <br>直接取name值，先从Page，然后是request,session,application<br>
    ${name}

    <br>从session中取值<br>
    ${sessionScope.name}

<br>---------------------------------<<br>

    <%
        User user = new User("zhangsan",18);
        session.setAttribute("user", user);
    %>
    ${user.name}
</body>
</html>
