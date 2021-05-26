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
		<h1>Book Title: "${ book.title}"</h1>
		<dl>
		  <dt>Description</dt>
		  <dd>- ${ book.description}</dd>
		  <dt>Language:</dt>
		  <dd>- ${book.language}</dd>
		  <dt>Number of Pages</dt>
		  <dd>- ${ book.numberOfPages }</dd>
		</dl>
	</div>
</body>
</html>