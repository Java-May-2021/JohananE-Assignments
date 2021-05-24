<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Survey Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="container">
		<div id="survey">
		<h2>Dojo Survey</h2>
		<form method="POST" action="/result">
			<p>Your Name: <input type="text" name="name"></p>
			<p>Dojo Location:
				<select name="location">
				<option value="Choose Location:"> Choose Location:</option>
					<option value="Los Angeles, CA">Los Angeles, CA</option>
					<option value="Chicago, IL">Chicago, CA</option>
					<option value="San Jose, CA">San Jose, CA</option>
				<option value="Dallas, TX">Dallas, TX</option>
				</select></p>
				<br>
			<p>Favorite Language:
				<select name="language">
				<option value=" Choose Language:">Choose Language:</option>
					<option value="Java">Java</option>
					<option value="Python">Python</option>
					<option value="MEAN">MEAN+</option>
					<option value="MERN">MERN</option>
					<option value="HTML5">Java</option>
				</select></p>
		<label> Comment (optional):</label><br>
		<textarea rows="9" cols="40" type="text" name="comment"></textarea>
		<button type="submit">Submit</button>
		</form>
		</div>
	</div>
</body>
</html>