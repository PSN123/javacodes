<%-- 
    Document   : loginprocess
    Created on : Jul 15, 2017, 4:08:58 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <%@page import="bean.LoginDao" %>>
        <jsp:useBean if="obj" class="bean.LoginBean">
            <jsp:setProperty property="*" name="obj"/>    
            <%
                boolean status=LoginDao.validate(obj);
            if(status){
                out.println("you are successfully logged in");
                session.setAttribute("session", "True");
            }
            else
            {
                out.print("sorry,email or password error");
        %>
        <jsp:include page="index.jsp"></jsp:include>>
        <% }
            
        %>    
    </body>
</html>
