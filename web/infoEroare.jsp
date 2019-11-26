<%--
  Created by IntelliJ IDEA.
  User: teo
  Date: 25.11.2019
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Eroare</title>
</head>
<body>
<h1>Eroare!</h1>
<jsp:useBean id="err" class="util.InfoEroare" scope="request" />
<h3><jsp:getProperty name="err" property="mesaj"/></h3>
<a href="index.jsp">Incearca din nou</a>
</body>
</html>
