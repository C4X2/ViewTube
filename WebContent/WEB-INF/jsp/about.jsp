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
	<!-- Top Banner Start -->
	<nav class="navbar">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="vt-ribbon-viewtube navbar-brand" href="/ViewTube/#index">ViewTube</a>
            </div>
            <ul class="vt-ribbon-list nav navbar-nav">
                <li class="vt-ribbon-list-elem"><a class="vt-ribbon-random" href=""><img alt="Random Video" src="resources/img/dice.png"></a></li>
            	<!-- I want this to act as a wildcard and show a random video -->
            </ul>
            <form class="navbar-form navbar-left form-inline" action="">
                <div class="input-group row">
                    <input class="form-control mx-5" type="text" placeholder="Search..." style="min-width : 376px; max-width : 500px">
                    <div class="input-group-btn">
                        <button class="vt-ribbon-button btn btn-outline-info" type="submit"><span class="glyphicon glyphicon-search"></span>Search</button>
                    </div>
                </div>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li class="vt-ribbon-list-elem">
                    <a class="vt-ribbon-personal" href="login.html">
						<img class = "vt-ribbon-icon" alt="profile_picutre" src="resources/img/loin.png">
				    	<!-- Eventually replace the static icon with a dynamically generated one src="#{usericon}" -->
				    </a>
                </li>
            </ul>
        </div>
    </nav>
	<!-- Top Banner End -->
	<h1>
		About Us!
	</h1>
	<h2>
		${aboutUsText}
	</h2>
</body>
</html>