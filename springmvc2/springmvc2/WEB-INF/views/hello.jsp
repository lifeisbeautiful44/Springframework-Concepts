<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello world</title>
</head>
<body>
<h1>Hello From spring mvc!!!!</h1>

<%
   Integer id = (Integer) request.getAttribute("id");
String name = (String) request.getAttribute("name");
Integer salary = (Integer) request.getAttribute("salary");

out.print(id);
out.print(name);
out.print(salary);

%>


</body>
</html>