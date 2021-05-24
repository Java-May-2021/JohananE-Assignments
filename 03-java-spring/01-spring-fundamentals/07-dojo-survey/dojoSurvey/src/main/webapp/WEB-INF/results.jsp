<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
	<h2>Submitted Info</h2>
	<p>Name: ${name}</p>
	<p>Dojo Location: ${location}</p>
	<p>Favorite Language: ${language}</p>
	<p>Comment: ${comment}</p>
	<br>
	<a href="/"><button>Go Back</button></a>
</body>
</html>