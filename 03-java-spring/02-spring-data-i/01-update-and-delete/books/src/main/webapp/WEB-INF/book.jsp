<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Title</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="container">
		<h1><c:out value="${oneB.title}"/></h1>
		<p>Description: <c:out value="${oneB.description}"/></p>
		<p>Language: <c:out value="${oneB.language}"/></p>
		<p>Number of pages: <c:out value="${oneB.numberOfPages}"/></p>
		<a href="/books/${oneB.id}/edit">Edit Book</a>
		<form action="/books/${oneB.id}" method="post">
		    <input type="hidden" name="_method" value="delete">
		    <input type="submit" value="Delete">
		</form>
	</div>
</body>
</html>