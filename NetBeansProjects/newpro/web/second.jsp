<%-- 
    Document   : second
    Created on : Nov 18, 2017, 3:38:11 PM
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
response.sendRedirect("https://www.google.co.in");
        %>
        value is  ${param.name}
    </body>
</html>
