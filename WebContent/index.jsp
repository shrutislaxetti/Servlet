<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#E6E6FA">
	<center>
		<h2>welcome</h2>
	</center>
	<center>
		<fieldset title="Home Page">
			<legend> Home Page</legend>
			<form action="PreLoginServlet" method="post">
				<center>
					<input type="submit" value="LOGIN" />
				</center>
			</form>
			<form action="PreRegisterServlet" method="post">
				<center>
					<input type="submit" value="REGISTER" />
				</center>
			</form>
		</fieldset>
	</center>
</body>
</html>