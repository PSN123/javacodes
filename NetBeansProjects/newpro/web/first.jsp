<%-- 
    Document   : first
    Created on : Nov 18, 2017, 3:37:54 PM
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
        <form action="second.jsp">
            Username:<input type="uname" name="name" >
            <input type="submit" value="go">
            <%
response.sendRedirect("second.jsp");

%>    
</body>
</html>
