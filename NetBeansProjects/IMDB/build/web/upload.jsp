<%-- 
    Document   : upload
    Created on : Dec 29, 2017, 6:45:19 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
   <% 
   MultipartRequest m=new MultipartRequest(request,"D:\movie");
   out.print("successfully upload");
   %>
    </body>
</html>
