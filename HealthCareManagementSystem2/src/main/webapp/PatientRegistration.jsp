<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Registration</title>
</head>
<body>
<h2>Enter Details</h2>
<form action = "insertpatient" method = "post">
Name : <input type  = "text " name = "name" /> <br>
Email: <input type = "email" name = "email" required/><br>
Password: <input type = "password" name = "password" required/><br>
Gender: 
    <input type="radio" name="gender" value="Male" /> Male
    <input type="radio" name="gender" value="Female" /> Female
    <input type="radio" name="gender" value="other" /> other<br>

    <input type="submit"  value="Submit" />



</form>
</body>
</html>