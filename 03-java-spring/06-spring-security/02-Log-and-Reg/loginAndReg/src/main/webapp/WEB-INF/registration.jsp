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
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1 class="text-center">New User</h1>
		<hr>
		<form:form method="post" action="/register/create" modelAttribute="user">
			<div class="form-group">
				<form:label path="username">User Name: </form:label>
				<form:errors path="username"/>
				<form:input path="username" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="firstName">First Name: </form:label>
				<form:errors path="firstName"/>
				<form:input path="firstName" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="lastName">Last Name: </form:label>
				<form:errors path="lastName"/>
				<form:input path="lastName" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="email">Email: </form:label>
				<form:errors path="email"/>
				<form:input path="email" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="password">Password: </form:label>
				<form:errors path="password"/>
				<form:input path="password" type="password" class="form-control"/>
			</div>
			<div class="form-group">
				<form:label path="passwordConfirmation">Password Confirmation: </form:label>
				<form:errors path="passwordConfirmation"/>
				<form:input path="passwordConfirmation" type="password" class="form-control"/>
			</div>
			<button type="submit" class="btn btn-outline-primary center">Submit</button>
		</form:form>
		<hr>
		<a href="/login">Log in</a>
	</div>
</body>
</html>