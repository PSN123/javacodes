<%-- 
    Document   : welcome
    Created on : Aug 30, 2017, 1:24:31 PM
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
        <%
            String name=request.getParameter("uname");
            out.print("welcome "+name);
            response.sendRedirect("http://www.google.com");
            
        %>
    </body>
</html>
 