<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>ViewTube</title>
    <link rel="stylesheet" href="resources/scss/viewtube.css" />
    <link rel="stylesheet" href="resources/scss/viewtube_index.css" />
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<!-- Js Popper library ___ should help display config -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<div class="justify-content-center">
	<div class="container-fluid">
		<div class="card">
			<div class="card-header">
				<h2 class="bg-primary text-white">Login</h2>
			</div>
			<div class="card-body">
				<form action="">
					<div class="input-group">
						<label class="text-muted" for="useremail">Email or Username</label>
						<input class="form-control" placeholder="Email or Username" type="text" required id="useremail" name="useremail">
					</div>
					<div class="form-group">
						<div class="input-group">
							<label class="text-muted" for="userpassword">Password</label>
							<input class="form-control" placeholder="Password" type="password" id = "userpassword" name="userpassword" required>
						</div>
					</div>
					<div class="form-group row form-inline">
						<input type="checkbox" name="remember" class="form-control">
						<label class="text-muted">Remember Me</label>
					</div>
					<div class="form-group row">
						<button class="btn btn-danger" type="button" action="">Cancel</button>
						<button class="btn btn-info" type="submit">Login</button>
					</div>
					<div class="form-group">
    					<a href="#">Forgot password?</a>
    					<a href="">Or Sign Up</a>
  					</div>
				</form>
			</div>
			<div class="card-footer">
				Hello!
			</div>
		</div>
	</div>
	</div>
</body>
</html>