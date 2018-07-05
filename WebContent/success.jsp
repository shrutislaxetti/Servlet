<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<h2> You have Successfully logged in!! </h2>
 
<body bgcolor="#E6E6FA">
Welcome ${sessionScope["username"]} <BR>
<!-- <i>welcome... -->
<%-- <% String Name=(String)request.getSession().getAttribute("username");
out.print(Name);
 --%>
<form action="LogoutServlet" method="post">
<input type="submit" value="Logout">

</form>
</body>
</html>