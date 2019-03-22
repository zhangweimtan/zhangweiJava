<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-03-22
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结算购物车</title>
</head>
<body>
<h2>您的购物车商品如下：</h2>
<%
    //1,先获取到map
    Map<String, Integer> map = (Map<String, Integer>) session.getAttribute("cart");
    //2,遍历map
    if (map != null) {
        for (String key : map.keySet()) {
            int value = map.get(key);
            //key-商品名，value-商品数量
//                <h3>名称：Iphone7 数量：</h3>
%>
<h3>名称：<%=key %> 数量 <%=value %>
</h3>
<%
        }
    }
%>
    <a href="ClearCartServlet"><h4>清空购物车</h4></a>
</body>
</html>
