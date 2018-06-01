<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "springwork.model.User" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%User u = (User)session.getAttribute("userkey"); %>
	<div class="user_table">
		<table>
			<tr>
				<td>User Name </td>
				<td><%= u.getUsername() %></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><%= u.getPassword() %></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><%= u.getEmail() %> </td>
			</tr>
		</table>
		<a href="modify">Modify your info</a>
	</div>
</body>
</html>