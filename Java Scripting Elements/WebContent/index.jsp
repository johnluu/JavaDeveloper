<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My title</title>
</head>

<%! int count = 0;
	int sum;
	void incrementCount(){
		count++;
	}%>
	
	

	
	


<body>

<form>
num1 <input type = "text" name ="num1" /><br/>
num2 <input type="text" name="num2" /> <br/>
exp <input type = "text" name ="exp" /><br/>
<input type= "submit" name="calc" value="calc" /> <br>
</form>

<h1>Sample page</h1>
<h2> 
<%
	int localVar = 0;
	out.print("This page is viewed" + count + "times");
	incrementCount();
%>

	The value of the local var is <%=localVar %>
	<%localVar++; %>
	


<%
if(request.getParameter("calc") != null){
	
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String exp = request.getParameter("exp");
	

	
	switch(exp){
	case "*":
		sum = num1 * num2;
		break;
	case "-":
		sum = num1 - num2;
		break;
	case "/":
		sum = num1 / num2;
		break;
	case "+":
		sum = num1 + num2;
		break;
		
	}
		out.print("<br>" + num1 + " " + exp + " " + num2 + "<br/>");
		out.print("The sum is " + sum + "<br/>");
	
}

%>
	
</h2>




</body>
</html>