<%--
  Created by IntelliJ IDEA.
  User: XuHao
  Date: 2020/2/24
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/LoginServlet">
    <input type="text" name="username">
    <input type="submit" value="登陆">
</form>
</body>
</html>
