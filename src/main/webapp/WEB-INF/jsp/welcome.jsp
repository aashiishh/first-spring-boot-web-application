<html>

<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
<div>
<div>
<div style="float: left;"><font color="green">${message}</font></div>
<div style="float: right;">
<form action="/logout">
<button type="submit" value="logout" class="btn btn-danger">logout</button>
</form>
</div>
</div>
<br>
	<center><h2><u>Welcome <i>${name}</i>!!</u><h2>
<br>
<a href="/manage-todos">Click here</a> to manage your todo list

    </center>

    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </div>
</body>

</html>