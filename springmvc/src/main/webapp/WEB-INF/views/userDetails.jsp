<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import ="com.srijansil.spring.springmvc.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USer Details</title>
</head>
<body>

	<h1>User is successfully Created.</h1>
	<%
     User user = (User) request.getAttribute("user");

	out.print(user.getId());
	out.print(user.getName());
	out.print(user.getEmail());
	%>

</body>
</html>