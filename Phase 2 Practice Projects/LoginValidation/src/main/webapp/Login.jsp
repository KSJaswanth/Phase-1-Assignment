<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<form method ="get" action="Login.jsp">
	Enter User name:<input type="text" name="txtUname" required><br/><br>
	Enter Password:<input type="password" name="txtPword" required><br/><br>
	<input type="submit" value="check">
</form>  
  
  <%!
  boolean validate(String uname,String pass){
      if(uname.equalsIgnoreCase( "jasu")&& pass.equals( "jasu1998")){
          return true;
      }
  return false;
  }
  
  %>

  <%
  String uname=request.getParameter("txtUname");
  String password=request.getParameter("txtPword");
 	if(uname!=null && password!=null){
     if(validate(uname,password)){
         session.setAttribute("user",uname);
     	RequestDispatcher rd= request.getRequestDispatcher("Welcome.jsp");
     			rd.forward(request,response);
     }
     else
         out.println("invalid username & password");
 }
  %>