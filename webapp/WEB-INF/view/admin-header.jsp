<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>javidmobile</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<spring:url value="/resources/js" var="js"/>
<spring:url value="/resources/jquery" var="jq"/>
<spring:url value="/resources/css" var="css"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${jq}/jquery.dataTables.js"></script>
  <link href="${css}/dataTables.bootstrap.css" >
  <style>
  .container
	{
	background-color:#D3D3D3;
	}
	</style>
  
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="adh">Movil</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="adh">AdminHome</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">AdminProduct <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="adminprod">ManageProduct</a></li>
          
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">AdminCategory <span class="caret"></span></a>
        <ul class="dropdown-menu">
      <li><a href="mgncat">ManageCategory</a></li>
      </ul>
      </li>
     
    </ul>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="admin/logout"><span class="glyphicon glyphicon-log-out"></span>log out</a></li>
      </ul>
  </div>
</nav>
  

