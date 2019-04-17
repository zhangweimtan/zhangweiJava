<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.myJsp.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-17
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:set var="name" value="zhangsan" scope="session"></c:set>

    ${sessionScope.name}
<br>------------------------------<<br>
    <c:set var="age" value="18"></c:set>
    <c:if test="${age>16}">
        年龄大于16岁。。
    </c:if>
    <br>------------------------------<<br>
    <c:if test="${age>26}" var="flag" scope="session">
        年龄大于26岁。。。
    </c:if>

    ${flag}
    ${sessionScope.flag}

    <br>------------------------------<<br>
    <c:forEach begin="1" end="10" var="i" step="2">
        ${i}
    </c:forEach>
    <br>------------------------------<<br>
<%
    List list = new ArrayList();
    list.add(new User("lisi",19));
    list.add(new User("zhansan",18));
    list.add(new User("sisi", 20));
    pageContext.setAttribute("list", list);
%>

<c:forEach var="user" items= "${list}" >
    ${user.name}---${user.age}<br>
</c:forEach>
</body>
</html>
