<%-- 
    Document   : login
    Created on : Jul 15, 2017, 3:53:01 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="index.jsp" %> 
    <hr/>
    
    <h3>login Form</h3>
    <% 
        String profile_msg=(String)request.getAttribute("profile_msg");
       if(profile_msg !=null){
        out.print(profile_msg);
    }
    String login_msg=(String)request.getAttribute("login_msg");
    if(login_msg!=null){
        out.print(login_msg);
    }
     %>
    <br/>
    
    <nav class="navbar navbar-inverse" style="background-color:#F8F6F6">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
<span class="icon-bar"></span>   
   </button>
<a class="navbar-brand" href="#">Foodhub</a>
</div>
<div class="collapse navbar-collapse" id="myNavbar">
<ul class="nav navbar-nav ">
<li class="active"><a href="#">Home</a></li>
<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">page<span class="caret"></span></a>
<ul class="dropdown-menu">
<li><a href="#">page 1-1</a></li>
<li><a href="#">page 1-2</a></li>
<li><a href="#">page 1-3</a></li>
</ul>
</li>
<li><a href="#">page 2</a></li>
</ul>
<ul class="nav navbar-nav navbar-right">
<li><a href="#"><span class="glyphicon glyphicon-user"></span>sign up</a></li>

 <li><span class="glyphicon glyphicon-login">
 <button type="button" class="btn btn-black btn-lg" data-toggle="modal" data-target="#myModal">login</button></span></li>
<div class="modal fade" id="myModal" role="dialog">
<div class="modal-dialog">
<div class="modal-content">
<div class="modal-header">
<button type="button" class="close" data-dismiss="modal">&times;</button>
<h4 class="modal-title">Modal header</h4>
</div>
<div class="modal-body">
    <form action="loginprocess.jsp" method="post">
<div class="form-group">
<label for="email">Email address:</label>
<input type="email" class="form-control" id="email" required>
</div>
<div class="form-group">
<label for="pwd">password:</label>
<input type="password" class="form-control" id="pwd" required>
</div>
<div class="checkbox">
<label><input type="checkbox">Remember me</label>
</div>
<button type="submit" value="login" class="btn btn-default">Submit</button>
</form>
</div>
<div class="modal-footer" >
<button type="button" class="btn btn-default" data-dismiss="modal">close</button>
</div>
</div>
</div>
</div>
</div>
</div>
    
    </body>
</html>
