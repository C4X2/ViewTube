<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>ViewTube</title>
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    
    <link rel="stylesheet" href="resources/scss/viewtube.css" />
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <!-- The banner at the top of the webpage  -->
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="vt-ribbon-viewtube" href="#">ViewTube</a>
            </div>
            <ul class="vt-ribbon-list nav navbar-nav">
                <li class="vt-ribbon-list-elem col-md-1"></li>
                <li class="vt-ribbon-list-elem col-md-2"><a class="vt-ribbon-random" href=""><img alt="Random Video" src="resources/img/dice.png"></a></li>
            </ul>
            <form class="navbar-form navbar-left form-inline" action="">
                <div class="input-group">
                    <input class="vt-ribbon-input form-control" type="search" placeholder="Search...">
                    <div class="input-group-btn">

                        <button class="vt-ribbon-button btn btn-info "><span class="glyphicon glyphicon-search"></span>Search</button>
                    </div>
                </div>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li class="vt-ribbon-list-elem">
                    <a class="vt-ribbon-personal">
					<img class = "vt-ribbon-icon" alt="profile_picutre" src="resources/img/loin.png">
				    <!-- Eventually replace the static icon with a dynamically generated one src="${usericon}" -->
				</a>
                </li>
            </ul>
        </div>
    </nav>
	<h1>
		Contact Us!
	</h1>
	<div>
	${developer}
	</div>
	<div>
	${contactus}
	</div>
	<h2>Leave us a message</h2>
	<form class="form-horizontal" action="/action_page.php">
    <div class="form-group ">
    <div class="float-right col-md-6">
      <label for="firstName" class="control-label  float-right">First Name:</label>
      </div>
      <div class="float-right col-md-6">
      <label for="lastName" class="control-label  float-right">Last Name:</label>
      </div>
      <div class="col-md-6">
          <input type="text" class="form-control" id="firstName" placeholder="Enter First Name" name="firstName">
      </div>
      <div class="col-md-6">
          <input type="text" class="form-control" id="lastName" placeholder="Enter Last Name" name="lastName">
      </div>
    </div>
    <div class="form-group col-md-12">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="form-group form-group-lg col-md-12">
      <label for="message">Message:</label>
      <textarea rows="3" class="form-control input-lg" id="message" name="message"></textarea>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</body>
</html>