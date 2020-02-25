<%--
  Created by IntelliJ IDEA.
  User: XuHao
  Date: 2020/2/23
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>if测试</h4>
<hr>
<form action="jstl.jsp" method="get">
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登陆">
</form>
<c:if test="${param.username}" var="isAdmin">
    <c:out value="管理员欢迎你"/>
</c:if>
<c:out value="isAdmin">

</c:out>
</body>
</html>
