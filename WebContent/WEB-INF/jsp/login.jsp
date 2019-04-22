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

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<div class="justify-content-center">
	<div class="container-fluid">
		<div class="card">
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
				<div class="form-group row">
					<label>
						<input type="checkbox" name="remember" class="form-control"> Remember me
					</label>
				</div>
				<button class="btn btn-info" type="submit">Login</button>
				  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
    <label>Or Sign Up</label>
  </div>
			</form>
		</div>
	</div>
	</div>
</body>
</html>