<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<style>
.login-box {
	height: 419px;
}

.eye {
	position: relative;
	right: 127px;
}

.show {
	position: relative;
	bottom: 35px;
	left: 20px;
}
</style>
</head>
<body>
	<form method="post" action="Studentloginservlet">
		<div class="login-box">
			<img src="user.png" class="avatar">
			<h1>Student Login</h1>
			<p>Username</p>
			<input type="text" name="username" placeholder="Enter Username"
				required="required">
			<p>Password</p>
			<input type="password" name="password" placeholder="Enter Password"
				required="required" id="input"> <input type="checkbox"
				onclick="myfunc()" class="eye">
			<p class="show">Show Password</p>
			<script>
            function myfunc(){
            	var x = document.getElementById("input");
            	if(x.type === "password"){
            		x.type = "text";
            	}
            	else{
            		x.type = "password";
            	}
            }
			</script>
			<input type="submit" name="submit" value="Login">
			<center>
				<h1>
					<a href="index.html">Back</a>
				</h1>
			</center>
		</div>
	</form>
</body>
</html>
