<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<%
	String message = "";
	String userName = ""; 
	String password = "";
	String firstname = "";
	String lastname = "";
	String[] hobbies;
	String gender = "";
	String country = "";

		
	userName = request.getParameter("userName");
	password = request.getParameter("password");
	firstname = request.getParameter("firstname");
	lastname = request.getParameter("lastname");
	hobbies = request.getParameterValues("hobbies");
	gender = request.getParameter("gender");
	country = request.getParameter("country");
	
	if(userName == "")
		{
		message += "userName cannot be null %0A";
		}
	 
	if(password.equals(""))
	{
		message += "password cannot be null %0A";
	}
	 
	if(firstname == "")
	{
		message += "firstname cannot be null %0A";
	}
	 
	if(lastname == "")
	{
		message += "lastname cannot be null %0A";
	}
	
	if(gender == "")
	{
		message += "gender cannot be null %0A";
	}
	
	if(country == "")
	{
		message += "country cannot be null %0A";
	}
	
	if(message != "")
	{
	response.sendRedirect("register.jsp?message=" + message);
	}

String hobby = "";
	for(String x: hobbies)
		hobby+= x + ",";

	

%>

<body>
<table>
<tr>
	<td> First name</td>
	<td> <%=firstname %> </td>
</tr>
<tr>
	<td> Last name</th>
	<td> <%=lastname %> </td>
	
</tr>
<tr>
	<td> User name</td>
	<td> <%=userName %> </td>
	
</tr>
<tr>
	<td> Gender</td>
	<td> <%=gender %> </td>
	
</tr>

<tr>
	<td> Hobbies</td>
	<td> <%=hobby %> </td>
	
</tr>

<tr>
	<td> country</td>
	<td> <%=country %> </td>
	
</tr>


</table>



</body>
</html>