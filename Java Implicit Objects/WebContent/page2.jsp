<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%
Integer visited = (Integer) (session.getAttribute("visited"));
Integer appcounter = (Integer) (application.getAttribute("appcounter"));
	if(visited == null)
	{
		if(appcounter == null)
		{
			appcounter = 1;
			
		}
		else
			appcounter++;
		
		application.setAttribute("appcounter", appcounter);
		
	}
	else
		visited = 1;
		session.setAttribute("visited", 1);
		
		Integer totalappcount = (Integer) (application.getAttribute("totalappcount"));
		if(totalappcount == null)
		{
			totalappcount = 1;
			
		}
		else
			totalappcount++;
	
		application.setAttribute("totalappcount", totalappcount);
		
		
		
	Integer pagecounter = (Integer) (application.getAttribute("page2counter"));
	if(pagecounter == null)
		pagecounter = 1;
	else
		pagecounter++;
		
	application.setAttribute("page2counter", pagecounter);
	
	Integer pagecontext = (Integer) (pageContext.getAttribute("pagecontext"));
	if(pagecontext == null)
		pagecontext = 1;
	else
		pagecontext++;
		
	pageContext.setAttribute("pagecontext", pagecontext);


%>
<body>
	<a href= "page1.jsp">page1</a> <a href= "page2.jsp">page2</a> <a href= "page3.jsp">page3</a>
	<h1> PAGE 2</h1>
	<h1> App visited(COUNT OF SESSIONS MADE): <%out.print(appcounter); %> </h1><br>
	<h1> All pages visited(Number of times app is accessed: Shares app count): <%out.print(totalappcount); %> </h1><br>
	<h1> Page Counter <%out.print(pagecounter); %> </h1><br>
	<h1> Page Context count <%out.print(pagecontext);%></h1>



</body>
</html>