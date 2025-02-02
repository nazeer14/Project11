<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center><h1>
<%
HttpSession ses=request.getSession(false);
session.invalidate();
String msg=(String)request.getAttribute("msg");
out.println(msg);
%></h1>
<%@ include file="index.html" %>
</body>
</html>