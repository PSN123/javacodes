<%-- 
    Document   : facebook
    Created on : Nov 25, 2017, 1:56:25 PM
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

    </head>
    <body style="background-color:#eeeff4;">

<nav class="navbar navbar-inverse " style="height:85px;background-color:#3b5998;">
   
  <div class="row">

  <div class="col-lg-5"> 
 <div class="navbar-header">
  <a class="navbar-brand" href="#" style="color:white; margin-left:150px;margin-top:25px;font-size:40px;font-family:klavika Bold;">
  <b>facebook</b></a>
  </div>
 </div> 
   
 <div class="col-lg-3">
 <form><label style="color:white;font-size:10px; margin-left:37%">Username or phone</label> 
 <input  type="text" placeholder="enter email or phone" required style="margin-left:37%;margin-top:-1px";></input></form> 
  </div> 	
 <div class="col-lg-3"> 
<form><label style="color:white; margin-left:1%; margin-top:15px; ">Password</label><br> 
 <input  type="text" placeholder="password" required style="margin-right:20%;"></input> 
  <input  type="button" value="log in" style="float:right;background-color:#3b5998;margin-right:40px;color:white;">  
 <a href="#" style=" margin-left:10px;text-size:1px;color:white;">forgot password?</a></form> 
</div> 
</div> 
</nav>
<div class="container">
<div class="row">
<div class="col-lg-6"> 
<b style="font-size:25px;"> Facebook helps you connect and share with<br> the people in your life.</b>
<div class="container">
<img src="Capture.png" class="img-rounded" alt="not found" width="50%" height="30%" style="padding-right:60px;">
</div>
</div>
<div class="col-lg-6">
<h1 style="margin-top:-10px;">Create an account</h1>
<small >it's free and always be.</small><br>
<input type="text" placeholder="Name" style="margin-top:10px">
<input type="text" placeholder="Surname" style="margin-top:10px"><br>
<input type="text" placeholder="Mobile Number or Email address"  style="margin-top:10px;float:right;width:350px;"><br>
<input type="text" placeholder="New Password"  style="margin-top:10px;float:right;width:350px;"><br>
<h4 style="padding-top:10px; padding-bottom:-0px; font-size:20px ">Birthday</h4>
<select id="p">
<option >0</option> 
 <option >1</option> 
<option >2</option> 
 <option >3</option>
 <option >4</option> 
<option >5</option> 
<option >6</option> 
 <option >7</option> 
 <option >8</option> 
 <option >9</option> 
<option >10</option> 
<!-- <option >11</option> -->
<!-- <option >12</option> -->
<!-- <option >13</option> -->
<!-- <option >14</option> -->
<!-- <option >15</option> -->
<!-- <option >16</option> -->
<!-- <option >17</option> -->
<!-- <option >18</option> -->
<!-- <option >19</option> -->
<!-- <option >20</option> -->
<!-- <option >21</option> -->
<!-- <option >22</option> -->
<!-- <option >23</option> -->
<!-- <option >24</option> -->
<!-- <option >25</option> -->
<!-- <option >26</option> -->
<!-- <option >27</option> -->
<!-- <option >28</option> -->
<!-- <option >29</option> -->
<!-- <option >30</option> -->
<!-- <option >31</option> -->
</select>
<select>
<option>Jan</option>
<option>Feb</option>
<option>Mar</option>
<option>Apr</option>
<option>Jun</option>
<option>Jul</option>
<option>Aug</option>
<option>Sep</option>
<option>Oct</option>
<option>Nov</option>
<option>Dec</option>
</select>
<select>
<option>2012</option>
<option>2013</option>
<option>2014</option>
<option>2015</option>
<option>2016</option>
<option>2017</option>
<option>2018</option>
<option>2019</option>
<option>2020</option>
<option>2021</option>
<option>2022</option>
<option>2023</option>
</select>

<a href="#" style="font-size:10px; ">why do I need to provide my date of birth.</a><br>

<div class="radio"	>
<label><input type="radio">Female</label>
<label><input type="radio" style="margin-right:5px;">Male</label>
</div>
<small style="color:grey;">by clicking Create an account, you agree to our <a href="#">Terms</a> and<br>
confirm that you have read our <a href="#">Data Policy</a>,including our <a href="#">Cookie <br> USe Policy.</a>
you may receive SMS message notifications from</br>
Facebook and can opt out at ant time.
</small></br> 
<button class="btn  btn-success btn-lg" style="margin-top:10px;margin-bottom:15px"><b>Create an account</b></button>
</button><br>
<p style="color:grey; padding-top:5px;" ><a href="#">Create a page</a>  for a celebrity, band or business.</p>
</div>





</div>
</div>



<footer>
<nav class="navbav navbar-inverse" style="background-color:white;height:100px; margin-top:50px; ">
  <div class="container">
 <p style="color:grey;margin-top:5;">English(UK)
 <a href="#" style="margin-left:15px;">हिन्दी </a>
<a href="#" style="margin-left:15px;">ਪੰਜਾਬੀ </a>
<a href="#" style="margin-left:15px;">اردو</a>
<a href="#" style="margin-left:15px;">বাংলা  </a>
<a href="#" style="margin-left:15px;">मराठी</a>
<a href="#" style="margin-left:15px;">తెలుగు  </a>
<a href="#"style="margin-left:15px;">ગુજરાતી</a>
<a href="#"style="margin-left:15px;">ಕನ್ನಡ </a>
<a href="#"style="margin-left:15px;"> മലയാളം</a>
<button class="btn" onclick="alert('add your choice')"><b>+</b></button>
</p><hr>
<p>
<a href="#">Sign up</a> 
<a href="#" style="margin-left:15px;">log in</a>
<a href="#" style="margin-left:15px;">Messenger</a>
<a href="#" style="margin-left:15px;">Facebook Lite</a>
<a href="#" style="margin-left:15px;">Mobile</a>
<a href="#" style="margin-left:15px;">Finds Friends</a>
<a href="#" style="margin-left:15px;">People</a>
<a href="#" style="margin-left:15px;">Pages</a>
<a href="#" style="margin-left:15px;">Places</a>
<a href="#" style="margin-left:15px;">Games</a>
<a href="#" style="margin-left:15px;">Locations</a></p>
<p>
<a href="#" style="margin-left:15px;">Celebrities</a>
<a href="#" style="margin-left:15px;">MarketPlace</a>
<a href="#" style="margin-left:15px;">Groups</a>
<a href="#" style="margin-left:15px;">Recipes</a>
<a href="#" style="margin-left:15px;">Sports</a>
<a href="#" style="margin-left:15px;">Moments</a>
<a href="#" style="margin-left:15px;">Instagram</a>
<a href="#" style="margin-left:15px;">About</a>
<a href="#" style="margin-left:15px;">Create Advert </a>
<a href="#" style="margin-left:15px;">Create Page</a>
<a href="#" style="margin-left:15px;">Developers</a></p>
<p>
<a href="#" style="margin-left:15px;">Careers</a>
<a href="#" style="margin-left:15px;">Privacy</a>
<a href="#" style="margin-left:15px;">Cookies</a>
<a href="#" style="margin-left:15px;">Adchoice</a>
<a href="#" style="margin-left:15px;">Terms</a>
<a href="#" style="margin-left:15px;">Help</a>
</p>


 
  
</div>
<p><abbr title="This page created By pradeep singh negi">@copyright-2017 	</abbr>NIItian</p>
</nav></footer>


 </body>
</html>
