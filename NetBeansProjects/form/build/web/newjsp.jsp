<%-- 
    Document   : newjsp
    Created on : Apr 2, 2018, 2:08:28 PM
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
String s1=request.getParameter("first");
out.print("Hi"+" "+s1);
String s2=request.getParameter("last");
out.print(" "+s2);
%>
    </body>
</html>
