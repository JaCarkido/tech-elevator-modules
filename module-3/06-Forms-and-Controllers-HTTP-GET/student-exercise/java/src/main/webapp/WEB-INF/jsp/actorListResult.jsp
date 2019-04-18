<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="/WEB-INF/jsp/common/header.jspf"%>

<c:url var="formMethod" value="/actorListResult" />

<form:form method="POST" action="${formMethod}" modelAttribute="Actor">
	<div>
		<form:input path="lastName" placeholder="Last Name"/>
		<form:errors path="lastName" cssClass="error"/>
		<input class="formSubmitButton" type="submit" value="Search" />
	</div>
</form:form>

<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
<td>
<div>${actor.firstName} ${actor.lastName}</div>

    
</td>
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>