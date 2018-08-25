<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CAS</title>
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
	<div class="container">

		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-login">
				<form class="form-signin" action="getUserDetails" method="post">
					<h2 class="text-center form-signin-heading">Yarncoms</h2>
					<label for="userId" class="sr-only">userId</label> <input
						type="text" id="userId" name="userId" class="form-control"
						placeholder="User Id" required autofocus>
					<div class="checkbox">
						<label> <input type="checkbox" value="remember-me">
							Remember me
						</label>
					</div>
					<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
						in</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>