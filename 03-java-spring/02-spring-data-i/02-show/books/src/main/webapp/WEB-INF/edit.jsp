<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
	<h1>Edit Book</h1>
	<div class="forms">
	<form action="/books/edit/${book.id}" method="post">
		<label>Book Title: <input type="text" value="${book.title}" name="title"></label>
		<br>
		<label>Language: <input type="text" value="${book.language}" name="language"></label>
		<br>
		<label>Number of Pages: <input type="number" value="${book.numberOfPages}" name="numberOfPages"></label>
		<br>
		<label>Description: <textarea name="description" rows="3" cols="12">"${book.description}"</textarea></label>
		<button type="submit">Update</button>
	</form>
	</div>
</body>
</html>