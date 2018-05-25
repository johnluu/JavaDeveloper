<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>

<body>
<% 
if(request.getParameter("register") != null)
{

String userName = request.getParameter("userName");
String password = request.getParameter("password");
String firstname = request.getParameter("firstname");
String lastname = request.getParameter("lastname");
String gender = request.getParameter("gender");
String country = request.getParameter("country");
String hobbies[] = request.getParameterValues("hobbies");

}

if(request.getParameter("message") != null && request.getParameter("message") != "")
	{
	out.print("<pre><span style='color:red'>" +request.getParameter("message") + "</span> </pre>" );
	}
%>

<form method = "post" action= "details.jsp">
First Name <input type = "text" name ="firstname" /><br/>
Last Name<input type="text" name="lastname" /> <br/>
Password <input type = "text" name ="password" /><br/>
User Name <input type="text" name="userName" /> <br/>
<input type="radio" name="gender" value="male"> Male<br>
<input type="radio" name="gender" value="female"> Female<br>
<input type="checkbox" name="hobbies" value="Dance">Dance<br>
<input type="checkbox" name="hobbies" value="Music">Music<br>
<input type="checkbox" name="hobbies" value="Sports">Sports<br>
<input type="checkbox" name="hobbies" value="Painting">Painting<br>
<select name ="country">
  <option value="United States">United states</option>
  <option value="China">China</option>
  <option value="India">India</option>
  <option value="Japan">Japan</option>
</select>

<input type= "submit" name="register" value="register" /> <br>


</form>




</body>
</html>