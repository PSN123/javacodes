<%-- 
    Document   : IDMB
    Created on : Dec 29, 2017, 3:42:34 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    </head>
    <body>
           <h1 id="actor"></h1>
  <img src=" " id="my_image">
           <script>
        
    function callApi(){
        
         $.getJSON("http://www.omdbapi.com/?i=tt3896198&apikey=bd8375d&t=transformers",function(result)
         {
console.log(result);            
$("#actor").text(result.Actors);
$("#Director").text(result.Director);
$("#my_image").attr("src",result.Poster);
$("#plot").text(result.Plot);
$("#t").text(result.Title);
    });
      }
    callApi();
        </script>
 <h1 id="actor"></h1>
  <a img src="" id="my_image"></a>
  <h1 id="Director"></h1>
  <b><i id="plot"> </i></b>  
  <b><i id="t"></i></b>  
 
    </body>
</html>
