<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>

<body bgcolor="#E6E6FA">
	
	<form action="RegisterServlet" method="post">
	<fieldset title="Registration Page">
	<legend><h2>Registration Page</h2></legend>
		<table style="with: 10%">
			<tr>
				<td>User-Name</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Email-id</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>phonenumber</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="passward" /></td>
			</tr>
			<tr>
				<td>Confirm-Password</td>
				<td><input type="password" name="confirm_pass" /></td>
			</tr>
			<td>
			<input type="submit" value="REGISTER" /></input>
			<input type="reset" value="Reset"></input></td> 
		</table>
		</fieldset>
	</form>
	<br>
</body>
</html>