<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time Template</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/time.js"></script>
</head>
<body>
	<div id= "container">
		<div id="header">
			<h3 class="time"><c:out value="${ strTime }" /></h3>
		</div>
	</div>
</body>
</html>