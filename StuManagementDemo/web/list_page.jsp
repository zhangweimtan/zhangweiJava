<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-23
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>学生列表</title>
    <script type="text/javascript">
        function doDelete(sid){
            var flag = confirm("是否确定删除？");
            if(flag){
            //    访问servlet
                window.location.href="DelServlet?sid="+sid;
            }
        }
    </script>
</head>
<body>
    <form action="SearchServlet" method="post">
        <table border="1" width="900">
            <tr>

                <td colspan="8" height="35">
                    按姓名查询<input type="text" name="sname">
                    按性别查询
                    <select name="sgender">
                        <option value="">--请选择--</option>
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    <input type="submit" value="查询">
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    <a href="add.jsp">添加</a>
                </td>
                <%--<td><a href="add.jsp">添加</a></td>--%>
            </tr>

            <tr align="center">
                <td>编号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>电话</td>
                <td>生日</td>
                <td>爱好</td>
                <td>简介</td>
                <td>操作</td>
            </tr>
            <%--@elvariable id="pageBean" type="com.myweb.stu.bean.PageBean"--%>
            <c:forEach items="${pageBean.list}" var="stu">
                <tr align="center">
                    <td>${stu.sid}</td>
                    <td>${stu.sname}</td>
                    <td>${stu.gender}</td>
                    <td>${stu.phone}</td>
                    <td>${stu.birthday}</td>
                    <td>${stu.hobby}</td>
                    <td>${stu.info}</td>
                    <td><a href="UpdateServlet?sid=${stu.sid}">更新</a>  <a href="#" onclick="doDelete(${stu.sid})">删除</a></td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="8">
                    第${pageBean.currentPage}/${pageBean.totalPage}页 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    每页显示${pageBean.list.size()}条 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    总记录数${pageBean.totalCount} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                    <c:if test="${pageBean.currentPage !=1}">
                        <a href="PageServlet?page=1">首页</a>|<a href="PageServlet?page=${pageBean.currentPage-1}">上一页</a>
                    </c:if>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <c:forEach begin="1" end="${pageBean.totalPage}" var="i">
                        <c:if test="${pageBean.currentPage == i}">
                            ${i}
                        </c:if>
                        <c:if test="${pageBean.currentPage != i}">
                            <a href="PageServlet?page=${i}">${i}</a>
                        </c:if>

                    </c:forEach>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <c:if test="${pageBean.currentPage !=pageBean.totalPage}">
                        <a href="PageServlet?page=${pageBean.currentPage+1}">下一页</a>|<a href="PageServlet?page=${pageBean.totalPage}">尾页</a>
                    </c:if>


                </td>
            </tr>
        </table>

    </form>


</body>
</html>
