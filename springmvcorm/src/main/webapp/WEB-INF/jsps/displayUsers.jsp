<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserInformation</title>
</head>
<body>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
			</tr>
			<tr>
				<td>${user.name}</td>
			</tr>
			<tr>
				<td>${user.email}</td>
			</tr>

		</c:forEach>
	</table>


	${users}

</body>
</html>