<html>

<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>
<div>
<div>
<div style="float: left;">
<form action="/login?name=${name}&password=" method="post">
<button type="submit" class="btn btn-success">Home</button>
</form>
</div>
<div style="float: right;">
<form action="/logout">
<button type="submit" value="logout" class="btn btn-danger">logout</button>
</form>
</div>

<br>
	<div class="container">
		<form method="post">
			<fieldset class="form-group">
				<label>Description</label> 
				<input name="desc" type="text"
					class="form-control" required="required"/>
			</fieldset>

			<button type="submit" class="btn btn-success">Add</button>
		</form>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>
</body>

</html>