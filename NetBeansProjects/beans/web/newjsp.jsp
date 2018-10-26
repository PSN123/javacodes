<%-- 
    Document   : newjsp
    Created on : Nov 22, 2017, 2:08:07 AM
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
        <jsp:useBean id="my" scope="page" class="my.NewClass">
            
        <% my.setName("pradeep");
 my.setNo(991100);
        %>
            
            <%=my.getName()%>
            <%=my.getNo()%>
            
        </jsp:useBean>

    </body>
</html>
