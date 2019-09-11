<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
	<center>
		<h1>Add Page</h1><br>
		<form action="AddController">
		<input type="text" name="empId" placeholder="Employee Id"><br>
		<input type="text" name="ssn" placeholder="SSN"><br>
		<input type="text" name="fname" placeholder="First Name"><br>
		<input type="text" name="lname" placeholder="Last Name"><br>
		<input type="number" name="mobile" placeholder="mobile"><br>
		<input type="text" name="department" placeholder="department"><br>
		<input type="text" name="designtion" placeholder="designtion"><br>
		<input type="text" name="bankNo" placeholder="bank account number"><br>
		<label>Date Of Birth</label>
		<input type="date" name="date" placeholder="date of birth"><br>
		<label>Joining Date</label>
		<input type="date" name="jdate" placeholder="joining date"><br><br>
		<input type="submit" value="Add">
		</form>
	</center>
</body>
</html>