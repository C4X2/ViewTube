<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		form {border: 3px solid #f1f1f1;}
		.border-hoarder {border: 3px solid #f1f1f1;}
	</style>
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
		<div class="card" style="max-width : 400px">
			<div class="card-header">
				<h2 class="bg-primary card-title text-white">${login} ${signup}</h2>
			</div>
			<div class="card-body">
				<form method="POST" action="loginattempt.html">
					<div class="form-group">
						<label class="text-muted" for="useremail">Email or Username</label>
						<input class="form-control" placeholder="Email or Username" type="text" required id="username" name="username">
					</div>
					<div class="form-group">
						<div class="input-group">
							<label class="text-muted" for="userpassword">Password</label>
							<input class="form-control" placeholder="Password" type="password" id = "password" name="password" required>
						</div>
					</div>
					<div class="form-group row form-inline">
						<div class="form-check">
							<input type="checkbox" id="remember" name="remember" class="form-check-input">
							<label class="text-muted form-check-label">Remember Me</label>
						</div>
					</div>
					<div class="form-group row">
						<button class="btn btn-danger" type="button" onclick="">Cancel</button>
						<button class="btn btn-info float-right" type="submit">${login} ${signup}</button>
					</div>
				</form>
			</div>
			<div class="card-footer">
				<div class="border-hoarder">
    				<a class="card-link" href="#">Forgot password?</a>
    				<a class="card-link" href="signup.html">Or Sign Up</a>
  				</div>
			</div>
		</div>
		<div>
			<p>TODO: NAVIGATE TO THE ADVERTISOR LOGIN, NAVIGATE TO THE CREATOR PAGE, NAVIGATE TO THE CURATPR/MODERATOR PAGE?</p>
		</div>
	</div>
	</div>
</body>
</html>