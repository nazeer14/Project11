<%@page import="com.pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<center>
	<h2>
		<%
			UserBean ub=(UserBean)application.getAttribute("bean");		
			out.println("welcome " + ub.getFirstname()+"<br><br>");
		%>
		
		<a href="view">View Proflie</a><br><br>
		<a href="logout">Logout</a>

</h2>
</body>
</html>