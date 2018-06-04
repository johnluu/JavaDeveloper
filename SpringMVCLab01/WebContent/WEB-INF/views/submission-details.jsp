<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	FirstName:<h1>${user.firstname}</h1><br>
	LastName:<h1>${user.lastname}</h1><br>
	UserName:<h1>${user.username}</h1><br>
	Gender:<h1>${user.gender}</h1><br>
	Phonenumber:<h1>${user.contactinfo.phonenumber}</h1><br>
	Email:<h1>${user.contactinfo.email}</h1><br>
	Password:<h1>${user.contactinfo.linkedinurl}</h1><br>
	SSN:<h1>${user.privateinfo.ssn}</h1><br>
	CCDN:<h1>${user.privateinfo.ccn}</h1><br>
	DOB:<h1>${user.privateinfo.dob}</h1><br>
	
</body>
</html>