<%-- 
    Document   : index
    Created on : Nov 16, 2017, 10:57:08 PM
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
  session.setAttribute("user", "pradeep");
%>
<a href="process.jsp">visit</a> 
    </body>
</html>
