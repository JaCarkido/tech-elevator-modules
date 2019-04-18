<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Films List" />

<c:import url="common/header.jsp" />


<%@include file="/WEB-INF/jsp/common/header.jspf"%>
<!-- Form goes here -->

<form method="GET" action="${formMethod}">
	<div>
		<input type="text" name="minimumLength" id="minimumLength"
			placeholder="Min Length" /> <input class="formSubmitButton" type="submit" value="Search" />
	</div>
</form>

<table class="table">
	<tr>
		<th>
			<td>Name</td>
			<td>Description</td>
			<td>Release Year</td>
			<td>Length</td>
			<td>Rating</td>
			
		</tr>
<c:forEach items="${filmList}" var="film">
<tr>
<td>
<div>${actor.firstName} ${actor.lastName}</div>

    
</td>
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>
