<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="container">
		<div class="table">
			<h1>Language List</h1>
			<table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Creator</th>
						<th>Version</th>
						<th>action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${lang}" var="lang">
					<tr>
						<td><a href="/language/${lang.id}">${lang.name}</a></td>
						<td>${lang.creator}</td>
						<td>${lang.version}</td>
						<td><a href="/language/edit/${lang.id}">Edit</a></td>
						<td><a href="/language/delete/${lang.id}">Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<h2>Input new language</h2>
		<div class="form">
			<form method="POST" action="/language">
				<p>
					<label>Name</label><input type="text" name="name">
					<br>
				</p>
				<p>
					<label>Creator</label><input type="text" name="creator">
					<br>
				</p>
				<p>
					<label>Version</label><input type="number" name="version">
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