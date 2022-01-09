<html>

<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body><div>
	<form method="post">
		<font color="red">*</font>Name : &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="name" /><br>
		<font color="red">*</font>Password : <input type="password" name="password" /> <br>
		<input type="submit" />
	</form>
	<font color="red">${message}</font>
	<font color="red">${logoutMessage}</font>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
</body>

</html>