<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.catp.beans.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
<style type ="text/css">
html,body{
	height: 100%;
}
td{border:1px solid blue;}
table{border: 2px solid red;}
</style>
</head>
<jsp:useBean id="userBean" class="com.catp.beans.Employee" scope="request"></jsp:useBean>
<body>
<div>
<% String designation = request.getParameter("designation"); 
	if(designation.equals("1")){
%> <jsp:include page="managerHeading.jsp">
	<jsp:param value="<%=userBean.getfName()%>" name="name"/> </jsp:include>
<%	}else if(designation.equals("2")){
%> <jsp:include page="traineeHeading.jsp">
	<jsp:param value="<%=userBean.getfName()%>" name="name"/> </jsp:include>
<% }else if(designation.equals("3")){
%>	<jsp:include page="developerHeading.jsp">
	<jsp:param value="<%=userBean.getfName()%>" name="name"/> </jsp:include>
<%} %>

<h1 style="color: green;"></h1><%= request.getParameter("message") %>
<h1>Registration Details</h1>

<table>
	<tr><td>FirstName </td> <td><jsp:getProperty property="fName" name="userBean"/></tr>
	<tr><td>LastName </td> <td><jsp:getProperty property="lName" name="userBean"/></tr>
	<tr><td>User Name </td> <td><jsp:getProperty property="uName" name="userBean"/></tr>
	<tr><td>Gender </td> <td><jsp:getProperty property="gender" name="userBean"/></tr>
	<% String hobbies[] = userBean.getHobbies(); %>
	<tr><td>Hobbies</td><td>
		<% for (String hobby:hobbies)
			out.print(hobby + ",");%> </td></tr>
</table>
</div>
</body>
</html>