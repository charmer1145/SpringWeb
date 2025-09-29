<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
<title>Login Success</title>
<link rel="stylesheet" href="<c:url value='/resources/css/login.css' />" />
</head>
<body>
	<div class="container success">
		<h2>Welcome, ${username}!</h2>
		<p>Login Successful ✅</p>
	</div>
</body>
</html>