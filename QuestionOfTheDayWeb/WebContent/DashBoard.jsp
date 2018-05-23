<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import = "qofd.Dao.QuestionDAO" %>
<%@ page import = "qofd.Dao.OptionDAO" %>
<%@ page import = "qofd.Models.Question" %>
<%@ page import = "qofd.Models.User" %>
<%@ page import = "qofd.Models.Option" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>

<%! QuestionDAO qDAO = new QuestionDAO();%>
<%! OptionDAO oDAO = new OptionDAO();%>
	



<% 
	List<Question> QuestionList = qDAO.getTodaysQuestion();
	HashMap<Integer,List<Option>> topOption= oDAO.getTopOption();
	User user = new User();

if(session.getAttribute("user") == null)
	response.sendRedirect("HomePage.jsp");
else
	user = (User) session.getAttribute("user");

%>

</head>
<body>
<%@ include file = "Header.jsp" %>
<h1> Welcome <%= user.getFirst_name() %></h1>
<h1> Today's Questions</h1>
<div><%
	

	for(Question q: QuestionList)
	{	
		out.print("<div> "+ q.getQuestion_text() + "</div> <br/>");
		
		for(Option option:topOption.get(q.getQuestion_id()))
		{
			out.print("<p> "+ option.getOption_text() + "</p> <br/>");
		}
		
	}
%></div>

</body>
</html>