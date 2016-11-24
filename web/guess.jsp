<%--
  Created by IntelliJ IDEA.
  User: Ian
  Date: 24/11/2016
  Time: 9:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .form {

            font-weight: bold;
        }


    </style>

</head>
<body>
<%
    String nric = request.getParameter("nric");
    String email = request.getParameter("email");

%>

<form class="form" action="/controller">
    Your nric is <%=nric%><br>
    your email address is <%=email%>
<input type="text" name="guess" placeholder="Pick your lucky number">
    <input type="submit" value="Submit">

</form>

</body>
</html>
