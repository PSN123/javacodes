<%-- 
    Document   : newjsp
    Created on : Nov 19, 2017, 3:00:18 PM
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
            <%
my.setName("pradeep");
my.setNo(991100);



%>
<%=my.getName()%>
<%=my.getNo()%>
        </jsp:useBean>



    </body>
</html>
