<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Book</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="container">
		<a href="/language">Dashboard</a>
		<br>
		<h1>${lang.name}</h1>
		<br>
		<p>${lang.creator}</p>
		<br>
		<p>${lang.version}</p>
		<br>
		<a href="/language/delete/${lang.id}">Delete</a>
		<br>
		<a href="/language/edit/${lang.id}">Edit</a>
	</div>
</body>
</html>