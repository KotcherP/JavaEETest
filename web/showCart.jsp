<%--
  Created by IntelliJ IDEA.
  User: KotMillioner
  Date: 04.09.2019
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@ page import="session.Cart" %>
<%
    Cart cart = (Cart)session.getAttribute("cart");
%>
<%=cart.getName() + "<br>"%>
<%=cart.getQuantity()%>
</body>
</html>
