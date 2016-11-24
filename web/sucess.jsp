<%--
  Created by IntelliJ IDEA.
  User: Ian
  Date: 24/11/2016
  Time: 9:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Congratulation <%=session.getAttribute("nric")%>,<%=session.getAttribute("guss")%> is the correct number!
<a href="guess.jsp">Back to Home</a>

</body>
</html>
