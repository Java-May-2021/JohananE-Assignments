<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/day.js"></script>
<title>Date Template</title>
</head>
<body>
	<div id= "container">
		<div id="header">
			<h3 class="date"><c:out value="${ strD }" /></h3>
		</div>
	</div>
	
</body>
</html>
