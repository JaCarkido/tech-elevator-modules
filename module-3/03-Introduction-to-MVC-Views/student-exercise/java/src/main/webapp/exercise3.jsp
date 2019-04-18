<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		
		<ul>
		<%--
			Given two query string parameters, "word" and "count":
			
			Add a number of list items equal to "count".  Each list item should contain the value passed in "word".
			
			The font size of the first list item should be equal to "count".  The font size of each subsequent list
			item should be decreased by 1.
			 
			See exercise3-echo.png for example output
		 --%>
		 <c:set var="name" />
		 <c:set var="count"/>
		 
		 <c:choose>
		 	<c:when test="${empty param.name}">
		 		<c:set var="name" value="Echo"/>
		 	</c:when>
				<c:otherwise>
						<c:set var="name" value="${param.name}" />
				</c:otherwise>
		</c:choose>
		
		 <c:choose>	 
		 	<c:when test="${empty param.count}" >
		 		<c:set var="count" value="16"/>
		 	</c:when>
		 		<c:otherwise>
		 			<c:set var="count" value ="${param.count}" />
		 		</c:otherwise> 
		 </c:choose>	
<%------------------------------------------------------------loop that writes the list items ----------------------------------------------%>		 
		 <c:forEach begin="${count}" end="0" var="size">
		 	<li style="font-size:${size}px">${name}</li>
		 	
		 </c:forEach>		 
		
		 
		</ul>
		
	</body>
</html>