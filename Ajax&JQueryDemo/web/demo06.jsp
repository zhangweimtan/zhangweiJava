<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-04-28
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
         //2,
        function checkUserName() {
            //1,获取输入框数据
            var name = $("#name").val();
            // alert("name="+name);
            $.post("CheckNameServlet",{username:name},function (data,status) {

                if(data === 1){
                    $("#span001").html("<font color='red'>用户已存在</font>");
                }else{
                    $("#span001").html("<font color='green'>用户未注册</font>");
                }
            });

        }
    </script>
</head>
<body>
    <table border="1" width="500">
        <tr>
            <td>用户名：</td>
            <td>
                <input type="text" name="username" id="name" onblur="checkUserName(this)" />
                <span id="span001"></span>
            </td>

        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td colspan="2" width="100"><input type="submit" value="注册"></td>

        </tr>
    </table>
</body>
</html>
