<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-29
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table width="100%">
    <c:forEach items="${list}" var="li">
        <tr>
            <td>${li.words}</td>
        </tr>
    </c:forEach>

</table>


