<%--
  Created by IntelliJ IDEA.
  User: teo
  Date: 25.11.2019`
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Temperatura convertita este:</p>
<jsp:useBean id="temp" class="conversie.InfoConversie" scope="request"/>
<p>Temperatura este: <jsp:getProperty name="temp" property="valoareConvertita"/> <jsp:getProperty name="temp" property="unitateCatre"/></p>

</body>
</html>
