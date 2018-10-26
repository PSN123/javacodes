<%-- 
    Document   : check.jsp
    Created on : Dec 30, 2017, 8:37:21 AM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 

<style>
 @charset "UTF-8";
@import url(https://fonts.googleapis.com/css?family=Raleway);
* {
  font-family: "Raleway", sans-serif;
}

body {
  height: 100vh;
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  box-sizing: border-box;
  font-weight: bold;
  font-size: 30px;
}

label {
  cursor: pointer;
}
label input[type="checkbox"] {
  display: none;
}
label input[type="checkbox"] + .label-text:before {
 
  transition: all 0.2s ease-in-out;
  margin: -6px 15px 0 0;
  vertical-align: middle;
  width: 30px;
  height: 30px;
  background: #ecf0f1;
  border: 2px solid #3498db;
  border-radius: 5px;
  color: #ecf0f1;
  content: "";
}
label input[type="checkbox"]:checked + .label-text:before {
  background: #FF4C4C;
  text-align: center;
  line-height: 1em;
  color: #ecf0f1;
  content: "B";
  
}

       </style>
</head>
      
    <body>
        <div class="container-fluid">
<div class="row">
<div class="col-md-8" style="background-color: lavender; font-size:20px; text-align: center; ">partytime
 <div class="panel-header"></div>
 <div class="panel-body">   
 <center>
    
     
    <div class="container" style="margin-top: 5%;">
        <%!int c,j;%>
   
          
      <%
int a=Integer.parseInt(request.getParameter("row")) ;
int b=Integer.parseInt(request.getParameter("Coloums")) ;
         
   for (c= 65; c <= 64+a; c++){
       
        for(j=1;j<b+1;j++){
            %>

          <label for="checkbox">
            <input id="checkbox" type="checkbox" name="checkbox"  id="<%=(char)c+""+j%>" value="<%=(char)c+""+j+",200"%>"><%=(char)c+""+j%>
<span class="label-text"></span>
</label> 

  <%
              
}System.out.println();
%>
<br>
<%
}     

     %>  
     </div>
</center>
</div></div>
     
     <div class="col-md-4">
     <h4><b>No.of Tickets:</b><span id="name"></span> </h4>
                            <h4><b>Amount:</b><span id="price"></span></h4>
                       </div>
    
</div></div>
   <script>
         
               var seatname;
  var seatprice = 0;
  var seatvalue;
var temp=[];
var count=1;

  $(function()
  {
     $('.seat-select').click(function ()
     {
              if($('input[type=checkbox]:checked').length>=0  && $(this).is(':checked')) 
              {
                  
                      seatprice = 0;
        seatname=0;
      
        $('input[type=checkbox]:checked').each(function (index, value) { 
 
          
        seatvalue=$(this).attr('value');
          console.log(seatvalue.split(","));
          temp =seatvalue.split(",");
          seatname +=parseInt(temp[0].length-1);

         seatprice += parseInt(temp[1]);
         
         console.log(seatname);
         console.log(seatprice);

        $("#name").text(seatname);
        $("#price").text(seatprice);

         });
        
        }     
    else
   {
       
            seatvalue=$(this).attr('value');
           temp =seatvalue.split(",");
          seatname -= parseInt(temp[0].length-1);

         seatprice-= parseInt(temp[1]);
         
        $("#name").text(seatname);
        $("#price").text(seatprice);
    }
     }); 
  });

    
     </script>   
    </body>
</html>
