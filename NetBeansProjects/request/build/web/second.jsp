<%-- 
    Document   : second
    Created on : Nov 19, 2017, 1:40:13 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
   <%
String aa=request.getParameter("uname");
out.print("welcome"+aa);

%>   
<a href="third.jsp">lets see the magic of response</a>
</body>
</html>
