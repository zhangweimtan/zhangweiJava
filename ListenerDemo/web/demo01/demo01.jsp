<%@ page import="com.myweb.domain.Bean01" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-05-07
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Bean01 bean = new Bean01();
        bean.setName("zhangsan");
        session.setAttribute("bean", bean);
        session.setAttribute("bean", "bb");
        session.removeAttribute("bean");
    %>
</body>
</html>
