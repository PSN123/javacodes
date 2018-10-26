<%-- 
    Document   : newjsp
    Created on : Nov 26, 2017, 2:47:25 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@include file="index.html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
<!--    <f:set var="name" value="pradeep"></f:set>
      ${name}
${(9/0)}
      -->
      <f:set var="salary" scope="session" value="${2000*2}"/>
      <f:if test="${salary>2000}">
          <p>my salary is:<f:out value="${salary}"/></p>
      </f:if>

          <f:set var="name" value="alok123" scope="session"></f:set>>
          <f:if test="${name !=null}">
              <f:out value="pradeep"/>
    </f:if>      
      <h1>Hello World!</h1>
    </body>
</html>
