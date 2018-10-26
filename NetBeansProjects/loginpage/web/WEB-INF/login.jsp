<%-- 
    Document   : login.jsp
    Created on : Jun 21, 2017, 7:57:42 PM
    Author     : Pradeep Negi
--%>

<%@page import="bean.LoginDao"%>
<jsp:useBean id="obj" class="bean.LoginBean"/>
    <jsp:setProperty property="*" name="obj"/>
    <%
       /*boolean status=LoginDao.validate(obj);
        if(status){
           out.println("you are successfully logged in");
       session.setAttribute("session", "true");
       }
        else
        {
            out.println("sorry,email or password error");
                    %>
                    <jsp:include page="index.jsp"></jsp:include>>
                    <%
                    }
%>
