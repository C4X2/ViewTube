<!DOCTYPE html>
<html>
<head>
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
    <!-- The banner at the top of the webpage  -->
    <nav class="navbar">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="vt-ribbon-viewtube navbar-brand" href="/ViewTube/#index">ViewTube</a>
            </div>
            <ul class="vt-ribbon-list nav navbar-nav">
                <li class="vt-ribbon-list-elem"><a class="vt-ribbon-random" href=""><img alt="Random Video" src="resources/img/dice.png"></a></li>
            	<!-- I want this to act as a wildcard and show a random video -->
            </ul>
            <form class="my-auto d-inline w-100 navbar-form form-inline navbar-left" action="">
                <div class="input-group row vt-ribbon-input">
                    <input class="form-control vt-search" type="text" placeholder="Search..." >
                    <div class="input-group-btn">
                        <button class="vt-ribbon-button btn btn-outline-info border-left-0" type="submit"><span class="glyphicon glyphicon-search"></span>Search</button>
                    </div>
                </div>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li class="vt-ribbon-list-elem nav-item dropdown">
                	<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
						<img class = "vt-ribbon-icon" alt="profile_picutre" src="resources/img/loin.png">
				    	<!-- Eventually replace the static icon with a dynamically generated one src="#{usericon}" -->
					</a>
				<div class="dropdown-menu">
        				<a class="dropdown-item" href="login.html"><span class="glyphicon glyphicon-lock"></span>Login</a><br/>
        				<c:if test="${loggedOn}">
        				 <a class="dropdown-item" href="subscriptions.html"><span class="glyphicon glyphicon-pushpin"></span>Subscriptions</a>
  						</c:if>
  				</div>
                </li>
            </ul>
        </div>
    </nav>
    
    <div class="vt-main">
        <h2>
            Welcome to ViewTube
            <br><br>
            <!-- TODO Will have a moving wheel of recommended videos -->
            <!-- TODO Will have a moving wheel of hot videos -->
        </h2>
    </div>

    <div class="vt-bottom-ribbon">
        <ul class="vt-bottom-ribbon-list">
            <li class="vt-bottom-ribbon-list-elem"><a class="vt-bottom-ribbon-link" href="about.html">About</a></li>
            <li class="vt-bottom-ribbon-list-elem"><a class="vt-bottom-ribbon-link" href="contactus.html">Contact Us</a></li>
            <li class="vt-bottom-ribbon-list-elem"><a class="vt-bottom-ribbon-link" href="developer.html">Developers</a></li>
            <li class="vt-bottom-ribbon-list-elem"><a class="vt-bottom-ribbon-link" href=""><i class="fa fa-twitter"></i></a></li>
            <li class="vt-bottom-ribbon-list-elem"><a class="vt-bottom-ribbon-link" href=""><i class="fa fa-github"></i></a></li>
        </ul>
    </div>
</body>

</html>