<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- Above is the tag library reference that we will be using -->
<html>
<head>

<!-- let's add tag srping:url -->
<spring:url value="/resources/scss/viewtube.css" var="viewTubeCSS" />
<spring:url value="/resources/js/viewtube.js" var="viewTubeJS" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link href="${viewTubeCSS}" rel="stylesheet" />
<script src="${viewTubeJS}"></script>
<!-- Finish adding tags -->

<title>Welcome to ViewTube!</title>
</head>
<body>${message}
	<br>
	<div
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
 
		<h2>Checkout this font color. Loaded from 'crunchify.css' file under '/WebContent/go/' folder</h2>
 
		<div id="crunchifyMessage"></div>
 
		<br> Spring MCV Tutorial by <a href="https://crunchify.com">Crunchify</a>.
 
		<br> <br> Click <a
			href="https://crunchify.com/category/java-tutorials/"
			target="_blank">here</a> for all Java and <a
			href='https://crunchify.com/category/spring-mvc/' target='_blank'>here</a>
		for all Spring MVC, Web Development examples.<br>
	</div>
</body>
</html>