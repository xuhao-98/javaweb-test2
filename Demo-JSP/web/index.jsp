<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: XuHao
  Date: 2020/2/22
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%--JSP表达式--%>
<%= new Date()%>
<hr>
<%--  JSP脚本片段--%>
<%
    int sum = 0;
    for (int i = 1; i < 10; i++) {
        sum += i;
    }
    out.println("<h1>" + sum + "</h1>");
%>
<hr>
<%
    for (int i = 0; i < 5; i++) {
%>
<h1>hell,world </h1>
<%
    }
%>
<%!
public void test(){
  System.out.println("进入这个方法！");
}
%>
</body>
</html>
