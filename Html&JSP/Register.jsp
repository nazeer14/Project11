<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page</title>
</head>
<body>
	<center>
	<%
		String data=(String)request.getAttribute("msg");
		out.println("<h3>");
		out.println(data);
		out.println("<h3>");
	
	%>
	<jsp:include page="index.html"></jsp:include>

</body>
</html>