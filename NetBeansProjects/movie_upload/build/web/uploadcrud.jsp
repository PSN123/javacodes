<%-- 
    Document   : uploadcrud
    Created on : Mar 18, 2018, 9:33:12 PM
    Author     : Pradeep Negi
--%>

<%@page import="javax.sound.midi.SysexMessage"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.sql.Array"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="movie.upcon" %>
<%@page import="movie.upgetset"%>
<%@page import="movie.upinter" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
<%
upinter up=new upcon();
ArrayList list=(ArrayList)up.get();
Iterator its=list.iterator();
System.out.println("a rha hai data "+list);
%>

    <c:set var="val" scope="page" value="<%=list%>"/>
    
    <div class="container-fluid"> 
     <table class="table table-striped"> 
         <thead>
             <tr>
                 <th>id</th>
             <th>Movie</th>
             <th>Poster</th>
             <th>Banner</th>
             </tr>
         </thead>
         <tbody>
         <c:forEach var="j" items="${val}">
 <tr>
     <td>${j.getId()}</td>
<td>${j.getMovie()}</td>

<td> <div class="col-xl-3,col-lg-4"><img class="img-responsive" style="width: 100%; height:300px;" src="${j.getPoster()}" ></div></td> 
 <td><div class="col-xl-3,col-lg-4"><img class="img-responsive" style="width: 50%; height:auto;" src="${j.getBanner()}" ></td>
 <td><a href="delup.jsp?m_id=${j.getId()}" class="btn btn-danger" role="button">Delete</a></td>
 </tr>
             
             
         </c:forEach>
             
         </tbody>
     </table>
        </div>
             </body>
</html>
