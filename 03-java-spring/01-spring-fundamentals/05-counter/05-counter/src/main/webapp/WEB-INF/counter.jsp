<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Count Tracker</title>
</head>
<body>
	<h2>Times visited: <c:out value="${counted}"/></h2>
	<p>Want to test again?<a href="/your_server">Click this link</a></p>
	<p>Want to test again by two? <a href="/your_server/counter-two">Click this link</a></p>
</body>
</html>