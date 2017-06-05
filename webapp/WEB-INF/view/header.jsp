<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html lang="en">
<head>
  <title>Javidmobiles</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
  
  <spring:url value="/resources/images" var="images"></spring:url>
  <spring:url value="/resources/js" var="js"></spring:url>
  <spring:url value="/resources/jquery" var="jq"></spring:url>
  <spring:url value="/resources/css" var="css"></spring:url>
  <script type="text/javascript" src="${jq}/jquery.dataTables.js"></script>
  <link href="${css}/dataTables.bootstrap.css" >
  
   <style type="text/css">
   pre{
   color:green;}
.navbar-brand>img {
   max-height: 100%;
   height: 100%;
   width: 50;
   margin:0,auto;


   /* probably not needed anymore, but doesn't hurt */
   -o-object-fit: contain;
   object-fit: contain; 

}
.container
	{
	background-color:#98FB98;
	}

</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    
      <a class="navbar-brand" href="log"><img src="resources/images/apple.jpg" alt="apple"style="height:250%"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="log">Movil</a></li>
      <li><a href="log">Home</a></li>
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Product <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="mob">Mobiles</a></li>
          <li><a href="acc">Accessories</a></li>
          <li><a href="ser">services</a></li>
          </ul>
          </li>
                       
       <li><a href="abt">AboutUs</a></li>
      <li><a href="get">Get in touch</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span></a>   
      <li><a href="reg"><span class="glyphicon glyphicon-user"></span> Start Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>Gain access</a></li>
       <li><a href="log"><span class="glyphicon glyphicon-log-out"></span>Exit</a></li>
    </ul>
  </div>
 
</nav>
  

