<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registraion Form</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>

<script>

$(document).ready(function(){
	
	$("#id").change(function()
			{
		$.ajax({
			
			url:'validateEmail',
			data: {
				id: $("#id").val()
				},
			success:function(responseText){
				$("#errMsg").text(responseText);
				if(responseText != "")
					{
					$("#id").focus();
					}
			}});		});
	
});

</script>


</head>
<body>

	<form action="registerUser" method="post">
		<pre>
		ID:<input type="text" name="id" id="id">  <span id="errMsg"></span>
		Name:<input type="text" name="name"> 
			Email:<input type="text" name="email">
			 <input type="submit" name="Click TO Register">

</pre>
	</form>

	<br> ${result};

</body>
</html>