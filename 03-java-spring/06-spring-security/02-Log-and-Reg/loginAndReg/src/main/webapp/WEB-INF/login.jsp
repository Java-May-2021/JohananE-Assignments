<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<h1 class="text-center">Login</h1>
		<p>${loginError}</p>
		<hr>
		<form method="POST" action="login/user">
			<div class="form-group">
				<label>Email: </label>
				<input name="loginEmail" type="email" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Password: </label>
				<input name="loginPass" type="password" class="form-control"/>
			</div>
			<button type="submit" class="btn btn-outline-primary center">Submit</button>
		<a href="/registration">Register user</a>
	</form>
	</div>
</body>
</html>