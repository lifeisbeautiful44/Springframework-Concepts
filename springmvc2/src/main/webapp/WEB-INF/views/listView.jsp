<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import = "com.srijansil.spring.springmvc2.dto.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List VIew</title>
</head>
<body>

<%
 List<Employee> employess = (List<Employee>)  request.getAttribute("emplooyess");

for(Employee e: employess )
{
	out.print(e.getId());
	out.print(e.getName());
	out.print(e.getName());

}


%>

</body>
</html>