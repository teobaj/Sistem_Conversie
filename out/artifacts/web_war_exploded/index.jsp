<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <FORM ACTION = "ConversieServlet" METHOD="POST">
  <p>
    Temperatura: <INPUT TYPE="text" NAME="valoareTemperatura">
  </p>
    <p>
      Din ce :
      <select name="unitateDin">
      <option value="celsius">°C</option>
      <option value="fahrenheit">°F</option>
      <option value="kelvin">K</option>
    </select>
    </p>
    <p>
      Din ce :
      <select name="unitateCatre">
        <option value="celsius">°C</option>
        <option value="fahrenheit">°F</option>
        <option value="kelvin">K</option>
      </select>
    </p>
  <p>
    <INPUT TYPE="submit" value="Trimite">
  </p>

  </FORM>

  </body>
</html>