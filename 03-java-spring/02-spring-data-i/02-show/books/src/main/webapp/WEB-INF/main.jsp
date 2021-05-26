<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="container">
		<h1>All Books</h1>
		<table>
	    	<thead>
		        <tr>
		            <th>Title</th>
		            <th>Description</th>
		            <th>Language</th>
		            <th>Number of Pages</th>
		        </tr>
	    	</thead>
	    	<tbody>
	        	<c:forEach items="${books}" var="book">
	        	<tr>
		            <td><c:out value="${book.title}"/></td>
		            <td><c:out value="${book.description}"/></td>
		            <td><c:out value="${book.language}"/></td>
		            <td><c:out value="${book.numberOfPages}"/></td>
		            <td><a href="/books/${book.id}">View</a></td>
		            <td><a href="/books/edit/${book.id}">Edit</a></td>	
		            <td><a href="/books/delete/${book.id}">Delete</a></td>
		            	          
	        	</tr>
	        	</c:forEach>
	    	</tbody>
	    </table>
	    <br>
	    <button><a href="/books/new">Create new book!</a></button>
	</div>
</body>
</html>