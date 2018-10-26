<%-- 
    Document   : one
    Created on : Nov 25, 2017, 2:06:25 PM
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
        <jsp:useBean id="my" scope="page" class="my.NewClass">
                   <jsp:setProperty name="my" property="name" ></jsp:setProperty>
                   <jsp:setProperty name="my" property="num"></jsp:setProperty>
            
            <jsp:getProperty name="my" property="name"></jsp:getProperty>
            <jsp:getProperty name="my" property="num"></jsp:getProperty>

        </jsp:useBean>        
    </body>
</html>
