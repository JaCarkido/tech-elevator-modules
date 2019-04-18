<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Campground Reservation Home Page" />
</c:import>
<div id="welcomeMsg">Welcome to Our Park List</div>

<ul>

<!--  this is an example of a form form // another example in mailing list from 09frankvalidation -->
<c:url value="campgroundList" var="campgroundListURL"/>
	<form:form action="${campgroundListURL}" method="POST" modelAttribute="parks">
		   
		<c:forEach var="park" items="${parks}">
			<li class="parkz">${park.name}</li>
		</c:forEach>
		
	</form:form>
	
</ul>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
