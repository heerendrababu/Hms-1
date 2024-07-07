<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Page</title>
<style>
div 
{
	margin-left: 650px;
}
</style>
</head>
<body>
<div>
	<form action="patient" method="post">
		
			<h2>Patient login</h2>
			Email:<input type="email" name="tbEmail" /><br> 
			password:<input type="password" name="tbPass" /><br>
		<!--    <a href="new User ?" value = "Register">forgot Password</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="new User ?"  value = "Register">new User?</a><br> -->  
			<input type = "submit" name = "reg" value= "New User ?"/>&nbsp &nbsp
			&nbsp &nbsp<input type="submit" name="login" value="login" />
		</form>	
		</div>
	
</body>
</html>
