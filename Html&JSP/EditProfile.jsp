<%@page import="com.pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body><center>
<h2>
	<%
	String uname=(String)request.getAttribute("name");
	UserBean bean=(UserBean)application.getAttribute("bean");
	
	out.println("<h2>This session belongs to "+uname+"<br><br>");
	out.println("--------Profile Deatils--------<br><br>");
	%>
	<form id="form-1" action="update" method="post">
		<input type="hidden" name="uname" value="<%=bean.getUsername()%>">
		FirstName : <input type="text" name="ufname" value="<%=bean.getFirstname()%>"/><br><br>
		LastName  : <input type="text" name="ulname" value="<%=bean.getLastname() %>"/><br><br>
		Mail_Id   : <input type="text" name="umail" value="<%=bean.getMail_id() %>"/><br><br>
		Phone No  : <input type="text" name="uphone" value="<%=bean.getPhone() %>"/><br><br>
		<input type="submit" value="Update"/>
	</form>
	
</h2>

</body>
</html>
