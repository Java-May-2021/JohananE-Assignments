<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${errors}</h2>
<form method="POST" action="/code">
<p>What is the code?</p>
<input type="text" name="guess">
<button>Try Code</button>
</form>
</body>
</html>