<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Form </h1>
	<form action = "process-form" method= "post">
		First Name<input type="text" name="firstname"/><br>
		Last Name<input type="text" name="lastname"/><br>
		User Name<input type="text" name="username"/><br>
		Gender<br><input type="radio" name="gender" value="male"/>Male<br>
		<input type="radio" name="gender" value="female"/>Female<br>
		Phone<input type="text" name="contactinfo.phonenumber"/> <br>
		Email<input type="text" name="contactinfo.email"/><br>
		LinkedIn<input type="text" name="contactinfo.linkedinurl"/><br>
		SSN<input type="text" name="privateinfo.ssn"/><br>
		Credit Card Number<input type="text" name="privateinfo.ccn"/><br>
		dob<input type="date" name="privateinfo.dob"/><br>
		<input type="submit" value="submit" name="button"/><br>
	</form>
</body>
</html>