<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<style>
div {
	margin-left: 650px;
}
</style>
</head>
<body>
<div>
<form action="reg">
<h2>Doctor Registration</h2>
Name: <input type = "text" name = "dName" /><br>
enterDoctorMail: <input type = "email" name = "dEmail"/><br>
enterDoctorProfession: <input type = "text" name = "dProfess" required/><br>
enterDoctorPassword: <input type = "password" name = "dPass" required/> <br>
Mobile: <input type = "tel" name = "dMobile"/><br>
<input type ="submit" name ="btnReg" value = "Click Here"/>

<!--  TO catch data coming from the controller addObject(), we use getAttribute -->
<%=request.getAttribute("res") %>
</form>
</div>
</body>
</html>