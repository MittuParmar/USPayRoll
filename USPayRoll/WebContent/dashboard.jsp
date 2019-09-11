<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h1>welcome : <%=request.getAttribute("uid")%></h1>
		<%
			if(request.getAttribute("status")!=null){
		%>
			<h2><%=request.getAttribute("status")%></h2>
		<%
			}
		%>
		<a href="Add">Add</a>
		<a href="Show">Show</a>
		<a href="Update">Update</a>
		<a href="Delete">Delete</a>
	</center>

</body>
</html>