<%@page import="com.pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body><center>
<%
	String uname=(String)request.getAttribute("name");
	UserBean bean=(UserBean)application.getAttribute("bean");
	
	out.println("<h2>This session belongs to "+uname+"<br><br>");
	out.println("--------Profile Deatils--------<br><br>");
	out.println(bean.getUsername()+"<br>"+bean.getFirstname()+"<br>"+bean.getLastname()+"<br>"+bean.getMail_id()+"<br>"+bean.getPhone()+"<br><br>");
	
%>
<a href="Edit">Edit Profile</a><br>
<a href="index.html">Logout</a>
</body>
</html>