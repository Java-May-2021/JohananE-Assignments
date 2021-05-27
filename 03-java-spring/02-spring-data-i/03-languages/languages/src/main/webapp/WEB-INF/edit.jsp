<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Edit</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<a href="/language/delete/{id}">Delete</a>
			<a href="/language">Dashboard</a>
		</div>
		<div class="form">
			<form method="POST" action="/language">
				<p>
					<label>Name  <input type="text" name="name" value="${lang.name}"></label>
					<br>
				</p>
				<p>
					<label>Creator <input type="text" name="creator" value="${lang.creator}"></label>
					<br>
				</p>
				<p>
					<label>Version <input type="number" name="version" value="${lang.version}"></label>
					<br>
				</p>
				<p>
					<button type="submit">Submit</button>
				</p>
			</form>
		</div>
	</div>
</body>
</html>