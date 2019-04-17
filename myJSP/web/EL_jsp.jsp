<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
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

    <%
        pageContext.setAttribute("name", "page");
        request.setAttribute("name", "request");
        session.setAttribute("name", "session");
        application.setAttribute("name", "application");
    %>

    <br>JSP普通方法获得值<br>
    <%=pageContext.getAttribute("name")%><br>
    <%=request.getAttribute("name")%><br>
    <%=session.getAttribute("name")%><br>
    <%=application.getAttribute("name")%><br>
    <br>


    EL获取值<br>
    ${ pageScope.name }<br>
    ${ requestScope.name }<br>
    ${ sessionScope.name }<br>
    ${ applicationScope.name }<br>

    <%
        String [] a = {"aa","bb","cc"};
        pageContext.setAttribute("array", a);
    %>
    <br>使用EL表达式获取作用域中数组的值<br>

    ${ array[0]}
    ${ array[1]}
    ${ array[2]}

    <br>----------------list--------<br>
    <br>使用EL表达式获取作用域中集合的值<br>
    <%
        List list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        pageContext.setAttribute("li", list);
    %>

    ${li[0]}
    ${li[1]}
    ${li[2]}

    <br>------Map数据0----------<br>

    <%
        Map map = new HashMap();
        map.put("name", "zhangsan");
        map.put("age", 18);
        map.put("address", "beijing");
        pageContext.setAttribute("map", map);
    %>
    ${map.name}
    ${map.age}
    ${map.address}
</body>
</html>
