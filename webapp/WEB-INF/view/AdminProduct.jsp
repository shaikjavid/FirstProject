<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Javidmobiles</title>
</head>
<body>
<%@include file="admin-header.jsp" %>

<div class="container-fluid">
<div class="row">
<div class="col-sm-1"></div>
<div class="col-sm-10">

<a href="newproduct" class='btn btn-primary'>Add New Product</a>

</div>
<div class="col-sm-1"></div>
</div>
</div>
<br>

<script type="text/javascript" src="${js}/productj.js"></script>

<div class="container-fluid">
<div class="row">
<div class="col-sm-1"></div>
<div class="col-sm-10">
<table class="table table-hover" id="productstable">
<thead>
<tr>
<th>Product Name</th>
<th>Product Price </th>
<th>Quantity</th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
</table>
</div>
</div>
</div>



</body>
</html>