<%-- 
    Document   : delup
    Created on : Mar 18, 2018, 9:14:31 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="movie.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><%
 int m_id=Integer.parseInt(request.getParameter("m_id"));
 upcon uc=new upcon();
 uc.delete(m_id);
 response.sendRedirect("uploadcrud.jsp");
    %>
    </body>
</html>
