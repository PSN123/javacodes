<%-- 
    Document   : therater_partner
    Created on : Jan 15, 2018, 4:03:35 PM
    Author     : Pradeep Negi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<link rel="stylesheet" type="text/css" href="header_footer_colour.css">

        <script>
 </script>

    </head>
       <body>
                 <div class="container-fluid">
<div class="navbar navbar-inverse navbar-fixed-top opaque-navbar">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navMain">
  <span class="glyphicon glyphicon-chevron-right" style="color:white;"></span>
    
  </button>
        <a class="navbar-brand" href="index.jsp">WM</a>
    </div>
    <div class="collapse navbar-collapse" id="navMain">
      <ul class="nav navbar-nav">
 <!--       <li><a href="#">Movies</a></li>-->
        <li><a href="aboutus.jsp">About Us</a></li>
        <li><a href="shows.jsp">Shows</a></li>
       
        <!--<li class="active"><a href="LoginPage.jsp">LogIn</a></li>--> 
<!--<li><button class="btn btn-lg"  style="margin-top:5%; background-color:black; font-size:15px;cursor:pointer; color:white;" onclick="openNav()">Trailers</button>-->
</li>
      </ul>
        <ul class="nav navbar-nav navbar-right" style="color:white;   font-family:cursive; font-size:20px; margin-top:1%; cursor:pointer; ">
            <li><span class="glyphicon glyphicon-user ">|</span>
                <%
                    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
                    
               HttpSession sp=request.getSession(false);
    String s1=request.getParameter("username");
    String a=(String)sp.getAttribute("username");

    out.print("welcome  " +  s1);
 
 
            %></li>
   
          <li><a href="logout.jsp" role="button" class="btn" style="padding-bottom:5%;margin-bottom:-50px; "> Logout</a></li>
        </ul>
   
   
   
          
        
    </div>
  </div>
</div>
            
</div>
<!--            <div class="container-fluid">
/</div>-->
            <!--             <h2><span>Movies now in Theater</span></h2>  
         <script>
        
    function callApi(){
         $.getJSON("http://www.omdbapi.com/?i=tt3896198&apikey=bd8375d&t=Black_Panther",function(result)
         {
console.log(result);            
$("#actor").text(result.Actors);
$("#Director").text(result.Director);
$("#my_image").attr("src",result.Poster);
$("#plot").text(result.Plot);
$("#Tittle").text(result.Title);

    });
      }
    callApi();
        </script>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-4"> 
            <div class="card" style="width:400px">
                <div class="card-header" style="background-color:lavender;   font-size:20px; text-align:center ; "><b id="Tittle"</b></div>
 <div class="card-body">        
  <center><img class="img-responsive" id="my_image" width="350" height="30" ></center>
      </div>
      <div class="card-footer card-grey">
      <h4>Exclusive show</h4>
      <small>Action</small>
      <br>
      <a href="book.jsp"class="btn  btn-danger btn-block">Book Now</a>
<button type="button" class="btn btn-info btn-block" data-toggle="collapse" data-target="#demo">Plot</button>
  <div id="demo" class="collapse">
<b><i id="plot"></i></b>
  </div>
     
      </div>
        </div>
</div>
 <div class="col-sm-4" style="background-color:lavender; ">
here we go
    </div>
     <div class="col-sm-4" style="background-color:#818181; ">
here we go
    </div>
    </div>
</div>
            -->
            
 
   
               <br><br><br>
     
 <div class="container-fluid">
   
                 <div class="jumbotron-fluid"> 
                     <center><p class="text-muted" style="font-size:20px; ">MORE BENEFITS WITH MORE WAYS TO SHOP AND PAY</p></center>
             <div class="col-md-3">
        <center><span class="glyphicon glyphicon-globe" style="font-size:75px;"></span></center>
                    <center><p class="text" style="font-size:20px; "><b>Shop in India and around world</b></p>
                    <small class="text-muted">Signing up for a pay account is an easy process Make sure you have your personal details ready.</small>
                    </center>
                
             </div> 
        <div class="col-md-3">
            <center><span class="glyphicon glyphicon-credit-card" style="font-size:75px;"></span></center>
           <center><p class="text" style="font-size:20px; "><b>Pay without worries</b></p>
                    <small class="text-muted">With 24/7 fraud detection,we work around the clock to keep your account safe and secure.</small>
                    </center>
            
                 </div>
                 <div class="col-md-3">
                     <center><span class="glyphicon glyphicon-lock" style="font-size:75px;"></span></center>
               <center><p class="text" style="font-size:20px; "><b>Your purchases are protected</b></p>
                    <small class="text-muted">We cover you for eligible purchases if an item doesn't reach you or if its not as the seller described it.</small>
                    </center>     
                 </div>
                     <div class="col-md-3">
                     <center><span class="glyphicon glyphicon-shopping-cart" style="font-size:75px;"></span></center>
               <center><p class="text" style="font-size:20px; "><b>Faster checkout</b></p>
                    <small class="text-muted">Speed through checkout at millions of brands that accept KardPay.</small>
                    </center>
                     
                     </div>
                 </div>
     </div>
           
           
           
           
   
<!--           <==========================================================================================================> -->

           <div class="jumbotron-fluid" style="background-color: grey;"> 
               <div class="row" style="padding-left: 30%; margin-top: 5%; text-align: center; " >
             <!--   start of the first row -->  
                        <div class="col-sm-5" style="padding-right: 5%">
                            <h3 class="text-center" style="letter-spacing: 5px">Theatre Data</h3>       
                            <form   action="HALL" enctype="multipart/form-data"  method="post">
          <div class="form-group">
                 <select name="Dta_val" style="width: 480px;height:35px;border-radius: 8px" >
<option>*********Select Movie*********</option>
<option>Black Panther</option> 
<option>Raid</option>
<option>Sonu ke Titu Ki Sweety</option>
<option>Baaghi 2</option>
<option>Hichki</option>
<option>October</option>
<option>Daddy</option>
<option>Hate Story 5</option>

</select>
          </div>
          
                                
                                <div class="form-group">
   <select name="Dta_val" style="width: 480px;height:35px;border-radius: 8px" >
<option>*********Select Theater Location *********</option>
<option>Wave Cinemas,TDi Paragon Mall</option> 
<option>M2K  PITAMPURA, Rani Bagh/option>
<option>Delite Diamond,Delhi Gate</option>
<option>PVR ,Shalimar Bagh</option>
<option>PVR,Vikaspuri </option>

   </select>
          </div>
                                
                                
              <div class="form-group">
<select name="Dta_val" style="width: 480px;height:35px;border-radius: 8px" >
<option>*********Select Theater Date *********</option>
<option>29 March,2018</option>
<option>30 March,2018</option>
<option>31 March,2018</option>
<option>1 April,2018</option>
<option>2 April,2018</option>
<option>3 April,2018</option>
<option>4 April,2018</option>
<option>5 April,2018</option>
<option>6 April,2018</option>
</select>
              </div>
          <div class="form-group">
<select name="Dta_val" style="width: 480px;height:35px;border-radius: 8px" >
<option>*********Select Theater Time *********</option>
<option>10:00Am</option>
<option>10:20Am</option>
<option>10:30Am</option>
<option>10:45Am</option>
<option>11:00Am</option>
<option>11:20Am</option>
<option>11:45Am</option>
<option>12:00pm</option>
<option>12:10pm</option>
<option>12:20pm</option>
<option>12:30pm</option>
<option>12:45pm</option>
<option>01:00pm</option>
<option>02:00pm</option>
<option>Not Beyond </option>
</select>
 </div>
                                <div class="form-group">
                                    <input class="form-control" required   type="file"   name="image">
 </div>
                                
                                          
<!--                                       <div class="form-group">
              <input class="form-control" required   type="text" placeholder="Theater Plan Name"  name="Dta_val">
 </div>                         -->
                                
<!--pattern="^[A-Z][a-z]*[,][0-1][0-9][:][0-9]{2}[][AMP]+$"     -->

              <button type="submit" class="btn btn-info btn-block"> Upload It </button>  
                                               </form>
</div>
                          </div>
    
                </div>
 
</body>
</html>