<%-- 
    Document   : patientsignup
    Created on : Apr 6, 2019, 11:40:34 AM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>reset</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Tangerine">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}
.navbar {
  overflow: hidden;
  background-color: #333;
   width:1500;
   
}

.navbar a {
  float: right;
  font-size: 20px;
  color: white;
  text-align: center;
  padding: 40px 26px;
  text-decoration: none;
}



.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}



h1 {
  padding: 12px 40px;
  color: white;
}
body, html 
{
    height: 100%;
    font-family: Arial, Helvetica, sans-serif;
}

* {
    box-sizing: border-box;
}

.bg-img {
    
    background-image: url("h10.jpg");
    height: 650px;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    position: relative;
    top: -20px;
}


.container {
    position: absolute;
    left: 0;
    margin: 10px;
    max-width: 400px;
    padding: 15px;
    background-color: white;
}
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

.btn {
    background-color: #000000;

    padding: 16px 60px;
    border: none;
    cursor: pointer;
    
    opacity: 0.9;
}

.btn:hover {
    opacity: 1;
}

span.psw {
    float: right;
    padding-top: 16px;
}
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

@media screen and (max-width: 300px) 
{
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
       background-color:#f1f1f1;
    }
}
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}


</style>
</head>
<body>
    <div class="navbar">

     <a href="contact.jsp">CONTACT US</a>
      <a href="aboutus.jsp">ABOUT US</a>
  <a href="services.jsp">SERVICE</a>
  <a href="main.jsp">HOME</a>
<h1 style="font-family:courier;">CITY HOSPITAL</h1></div>



       <div class="bg-img">
  <form action="PatientController" method="post" class="container">
      <center><img src="p1.png" width="70" height="70"> </center>
    <center><label><h3>PATIENT'S SIGNUP</h3></label><br></center>
    <center><p>Please fill in this form to create an account.</p></center>
    <hr>
    
     <label for="pid"><b>Patient's Id</b></label>
    
    <input type="text" placeholder="Enter pid" name="pid" required>
    
    <label for="name"><b>Patient's Name</b></label>
    <input type="text" placeholder="Enter Name" name="pname" required>
    
  
   <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

  <br><br><br>


<div class="clearfix">
    <button type="button" class="cancelbtn"><a href="patientsignup.jsp">CANCEL</a></button>
     <button type="submit" class="btn">SIGNUP</button><br><br>
    </div>

  </form>
</div>




    </body>
</html>
