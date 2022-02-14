<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%
String uname=(String)session.getAttribute("user");
out.println("Welcome "+uname);

%>
<br> <a href="Logout.jsp"> Logout</a>
</body>
</html>