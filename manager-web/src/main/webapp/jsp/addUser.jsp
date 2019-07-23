<%--
  Created by IntelliJ IDEA.
  User: ouyangjq
  Date: 2019/7/22
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/user/addUser" method="post">
    用户名:<input name="username" type="text"/><br/>
    年龄:<input name="userage" type="text"/><br/>
    <input type="submit" value="OKOK"/>
</form>
</body>
</html>
