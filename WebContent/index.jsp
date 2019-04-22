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
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="vt-ribbon-viewtube" href="/ViewTube/#index">ViewTube</a>
            </div>
            <ul class="vt-ribbon-list nav navbar-nav">
                <li class="vt-ribbon-list-elem"><a class="vt-ribbon-random" href="login.html"><img alt="Random Video" src="resources/img/dice.png"></a></li>
            </ul>
            <form class="navbar-form navbar-left form-inline" action="">
                <div class="input-group row">
                    <input class="form-control" type="text" placeholder="Search...">
                    <div class="input-group-btn">
                        <button class="vt-ribbon-button btn btn-info"><span class="glyphicon glyphicon-search"></span>Search</button>
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
    
    <div class="vt-main">
        <h2>
            Welcome to ViewTube
            <br><br>
        </h2>
        <h3>
            <a href="welcome.html">Click here to navigate to the Welcome Page</a>
            <br><br>
        </h3>
        <h3>
            <a href="subscriptions.html">Click here to navigate to the Subscriptions Page</a>
        </h3>
    </div>

    <div class="vt-bottom-ribbon">
        <ul class="vt-bottom-ribbon-list">
            <li class="vt-bottom-ribbon-list-elem"><a class="vt-bottom-ribbon-link" href="about.html">About</a></li>
            <li class="vt-bottom-ribbon-list-elem"><a class="vt-bottom-ribbon-link" href="contactus.html">Contact Us</a></li>
            <li class="vt-bottom-ribbon-list-elem"><a class="vt-bottom-ribbon-link" href="developer.html">Developers</a></li>
        </ul>
    </div>
</body>

</html>