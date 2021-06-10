<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>	
	<div class="container-fluid">
		<nav class="navbar navbar-expand-sm bg-dark justify-content-center">
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" href="/categories/new">New Category</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/products/new">New Product</a>
				</li>
			</ul>
		</nav>
		<hr>
		<h1 class="text-center">Products</h1>
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Product Name</th>
					<th>Product Description</th>
					<th>Product Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${prods}" var="prod">
					<tr>
						<td><a href="/products/${prod.id}">${prod.name}</a></td>
						<td>${prod.description }</td>
						<td>${prod.price }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<h1 class="text-center">Categories</h1>
		<hr>
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Category Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cat}" var="cate">
					<tr>
						<td><a href="/category/${cate.id}">${cate.name}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>