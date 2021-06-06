<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>License</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="jumbotron">
			<h1 class="text-center">Welcome to the DMV's Registration Page</h1>
		</div>
		<nav class="navbar navbar-expand-sm bg-dark justify-content-center">
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" href="/person/new">Add Person</a>
				</li>
			</ul>
		</nav>
		<h1 class="text-center">New License</h1>
		<form:form action="/license/create/" method="post" modelAttribute="license">
			<div class="form-group">
		        <form:label path="person">Person</form:label>
		        <form:errors path="person"/>
		        <form:select type="select" path="person" class="form-control">
		        <c:forEach items="${people}" var="people">
		        	<form:option value="${people.id}">${people.firstName} ${people.lastName}</form:option>
				</c:forEach>
				</form:select>
   			</div>
   			<div class="form-group">
   				<form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:input path="state" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="expirationDate">Expiration Date</form:label>
		        <form:errors path="expirationDate"/>
		        <form:input type="date" path="expirationDate" pattern="MM/dd/yyyy"/>
			</div>
			<button type="submit" class="btn btn-outline-secondary btn-block">Register</button>
   		</form:form>
	</div>
</body>
</html>