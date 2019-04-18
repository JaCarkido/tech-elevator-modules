<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Campground Reservation Home Page" />
</c:import>
<div id="welcomeMsg">Welcome to Our Park List</div>

<ul>
	<c:forEach var="park" items="${parks}">
		<li class="parkz">${park.name}</li>
	</c:forEach>
</ul>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
