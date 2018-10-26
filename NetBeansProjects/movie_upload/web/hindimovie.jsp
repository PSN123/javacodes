<%-- 
    Document   : hindimovie
    Created on : Mar 17, 2018, 8:27:05 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <style>
        @font-face {
    font-family: myFirstFont;
    src: url(sansation_light.woff);
}
h1:hover{
    font-family: serif;
    font-style: oblique;
    cursor: pointer;
    }
</style>
    </head>
    <body>
        <div class="container-fluid">
   <div class="card bg-primary text-white">         
<div class="card-header">
    <h1>Upload Movie Details</h1>
</div></div>
            <div class="card-body">
                <form  action="uploader" method="post" enctype="multipart/form-data">   
                  <div class="form-group">  
                      <label class="control-label ">Movie Title:</label>
                  <input class="form-control" type="text" placeholder="Enter movie name here" name="movie">
                   </div>
                    
                    <div class="form-group">  
                      <label class="control-label ">Poster:</label>
                  <input class="form-control" type="file"  name="poster">
                   </div>
                    
                    <div class="form-group">  
                      <label class="control-label ">Banner:</label>
                  <input class="form-control" type="file"  name="banner">
                   </div>
            <div class="card bg-primary">
                    <div class="card-footer"> 
                    <input type="submit" class="btn btn-lg btn-primary" value="Submit" > 
               </div></div>
                    </form>
            </div>
               </div>
  

    </body>
</html>
