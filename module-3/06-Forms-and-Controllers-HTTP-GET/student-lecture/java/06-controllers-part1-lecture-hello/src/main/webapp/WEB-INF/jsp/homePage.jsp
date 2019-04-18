<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<c:url value="/greeting" var="formAction" />			<!-- define an always correct url for us to use -->
		<form method="GET" action="${formAction}">				<!-- Define a form to issue a GET on submit -->
			<label for="theName">Your Name: </label> 			<!-- Label text to appear on the page -->
			<input type="text" id="theName" name="name" /> 		<!-- Define a text input box called theName -->
																<!-- Associate the label name with this text box  -->
														 		<!-- Store any data in the variable name -->
			<input type="submit" value="Get Greeting" /> 		<!-- Define a submit button-->
		</form>													<!-- any form variables are added to the query string on submit -->
	</body>
</html>