<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<% if(request.getParameter("logout") != null) 
	{
	out.print("FSAGASG");
	session.invalidate();
	response.sendRedirect("HomePage.jsp");
	}
%>
	
<div>
<form method ="post">
<input type= "submit" name="logout" value="logout" /> <br>
</form>
</div>