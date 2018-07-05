<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		function myFunction() {
			var x = document.getElementById("myInput");
			if (x.type === "password") {
				x.type = "text";
			} else {
				x.type = "password";
			}
		}
	</script>
</head>
	<body bgcolor='#E6E6FA'>
		<form action="LoginServlet" method="post">
     <fieldset title="Login Page">
			<legend>
				<h2>Login Page</h2>
			</legend>
			<table bgcolor='#E6E6FA' style="with: 10%">
				<tr>
					<td>User-Name</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="passward" id="myInput" /></td>
				</tr>

			</table>
			<input type="checkbox" onclick="myFunction()">Show Password <br>
			<input type="submit" value="LOGIN"><br>
		</form>
		<form action="ForgetPassword" method="post">
			<td><input type="submit" value="Forget Password" /></td>
		</form>
</fieldset>
</body>
</html>