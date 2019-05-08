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
    <script type="text/javascript">
        //1,创建对象
        function ajaxFunction() {
            var xmlHttp;
            try { // Firefox, Opera 8.0+, Safari
                xmlHttp = new XMLHttpRequest();
            }
            catch (e) {
                try {// Internet Explorer
                    xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
                }
                catch (e) {
                    try {
                        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
                    }
                    catch (e) {
                    }
                }
            }

            return xmlHttp;
        }

        //2,
        function checkUserName() {
            var request = ajaxFunction();
            //获取输入框内的name
            var name = document.getElementById("name").value;
            // alert("username=" + name);
            //发送请求
            request.open("POST", "/CheckNameServlet", true);
            request.onreadystatechange = function () {
                if (request.readyState == 4 && request.status == 200) {
                    //弹出相应的信息
                    // alert(request.responseText);
                    var data = request.responseText;
                    if (data == 1) {
                        // alert("用户名已存在");
                        document.getElementById("span001").innerHTML = "<font color='red' > 用户名已存在 </font>";
                    } else {
                        // alert("用户名未注册");
                        document.getElementById("span001").innerHTML = "<font color='red'  > 用户名未注册 </font>";
                    }
                }
            }
            request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            request.send("username=" + name);

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
