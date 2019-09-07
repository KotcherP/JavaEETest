<%--
  Created by IntelliJ IDEA.
  User: KotMillioner
  Date: 03.09.2019
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First jsp</title>
</head>
<body>
<h1>Testing jsp</h1>
<p>
    <%@ page import="java.util.Date,logic.TestClass" %>
    <%
        Date now = new Date();
        String someString = "Текущая дата: " + now;
    %>
    <%= someString%><br>
    <%
        for (int i = 0; i < 2; i++) {
            out.println(i + "<br>");
        }
    %>
    <%=TestClass.getInfo()%>
</p>

<p>
    <%
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
    %>
    <%=String.format("Hello,%s %s", name, surname)%>
</p>
</body>
</html>
