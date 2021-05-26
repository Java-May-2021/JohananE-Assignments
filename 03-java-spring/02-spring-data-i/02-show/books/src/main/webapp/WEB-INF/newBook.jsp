<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Book</title>
</head>
<body>
	<h1>New Book</h1>
	<form action="/books" method="post">
		<p>
			Book Title:  <input type="text" name="title">
			<br>
		</p>
		<p>
			Description: <textarea rows=3 cols=13></textarea>
			<br>
		</p>
		<p>
			Language:    <input type="text" name="language">
			<br>
		</p>
		<p>
			Number of pages: <input type="number" name="numberOfPages">
			<br>
		</p>
			<button type="submit">Create</button>
	</form> 
</body>
</html>


<!-- <label path="title">Title:</label>
	        <form:errors path="title"/>
	        <input path="title" type="text"/>
	        <label path="description">Description:</label>
	        <form:errors path="description"/>
	        <textarea path="description" row=2 cols=15></textarea>
	        <label path="language">Language:</label>
	        <errors path="language"/>
	        <input path="language" type="text"/>
	        <label path="numberOfPages">Pages:</label>
	        <form:errors path="numberOfPages"/>     
	        <input type="number" path="numberOfPages"/>	 -->