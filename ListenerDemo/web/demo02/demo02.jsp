<%@ page import="com.myweb.domain.Bean02" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-05-07
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是demo02
<%
    Bean02 bean = new Bean02();
    bean.setName("lisi");
    session.setAttribute("bean", bean);


%>

</body>
</html>
