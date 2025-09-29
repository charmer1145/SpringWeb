<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body
	background="<c:url value="webapp/resources/images/images/back.jpg"/>" />
<div align="center">
	<h1>Welcome to ${user} User Page</h1>
	<p>page served on ${d}</p>
	<a href="spring">Click here for one more view</a>
</div>

</body>
</html>