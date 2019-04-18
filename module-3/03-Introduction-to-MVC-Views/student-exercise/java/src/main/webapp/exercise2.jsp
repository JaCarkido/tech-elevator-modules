<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			 <c:set var="firstNum" value="1"/>     <%-- these values allow me to start the sequence at the second 1 like in the pdf --%>
			 <c:set var="secondNum" value="2" />
			 <c:set var="fibonacci" />
			 
			 <c:forEach begin="1" end="25" >   
			 <li>${firstNum}</li>
			 <c:set var="fibonacci" value="${firstNum + secondNum}" />
			 <c:set var="firstNum" value="${secondNum}" />
			 <c:set var="secondNum" value="${fibonacci}"/>
			 
			 </c:forEach>
			 
		</ul>
	</body>
</html>